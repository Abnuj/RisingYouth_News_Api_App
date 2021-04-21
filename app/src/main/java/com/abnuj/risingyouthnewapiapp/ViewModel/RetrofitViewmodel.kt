package com.abnuj.risingyouthnewapiapp.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abnuj.risingyouthnewapiapp.Repository.RetrofitRepository
import com.abnuj.risingyouthnewapiapp.RetrofitModel.RetrofitNewsModel
import kotlinx.coroutines.launch
import retrofit2.Response

class RetrofitViewmodel(val retrofitRepository: RetrofitRepository):ViewModel() {

    val myNews :MutableLiveData<Response<RetrofitNewsModel>> = MutableLiveData()
    fun getLatestNews()
    {
        viewModelScope.launch {
            val newsResponse = retrofitRepository.getLatestNews()
            myNews.value = newsResponse
        }
    }
}