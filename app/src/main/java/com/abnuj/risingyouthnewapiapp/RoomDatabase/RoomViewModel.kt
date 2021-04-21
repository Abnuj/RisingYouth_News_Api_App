package com.abnuj.risingyouthnewapiapp.RoomDatabase

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RoomViewModel(application: Application):AndroidViewModel(application) {
    private val readAllData:LiveData<List<ArticleEntity?>>
    private val repository:NewsRepository

    init {
        val newsDao = NewsDatabase.getDatabase(application).newsDao()
        repository = NewsRepository(newsDao)
        readAllData = repository.readAlldata
    }

    fun addNews(listofArticles: List<ArticleEntity?>)
    {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addnews(listofArticles)
        }
    }
}