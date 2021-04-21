package com.abnuj.risingyouthnewapiapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.abnuj.risingyouthnewapiapp.Repository.RetrofitRepository
import com.abnuj.risingyouthnewapiapp.RoomDatabase.ArticleEntity
import com.abnuj.risingyouthnewapiapp.RoomDatabase.RoomViewModel
import com.abnuj.risingyouthnewapiapp.ViewModel.RetrofitViewmodel
import com.abnuj.risingyouthnewapiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var retrofitViewmodel: RetrofitViewmodel
    lateinit var mainActivityAdapter: MainActivityAdapter

    // Room Database
    lateinit var roomViewModel: RoomViewModel
    var articleEntitylist: List<ArticleEntity?> = ArrayList<ArticleEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.progressBar.visibility = View.VISIBLE
        val retrofitRepository = RetrofitRepository()
        val viewModelFactory = RetrofitViewModelFactory(retrofitRepository)
        roomViewModel = RoomViewModel(application)

        retrofitViewmodel =
            ViewModelProvider(this, viewModelFactory).get(RetrofitViewmodel::class.java)
        retrofitViewmodel.getLatestNews()

        retrofitViewmodel.myNews.observe(this, Observer { response ->
            if (response.isSuccessful) {
                mainActivityAdapter = MainActivityAdapter(response.body()!!.articles)

            } else {
                Log.d("resoponse", response.message())
            }
        })


    }
}