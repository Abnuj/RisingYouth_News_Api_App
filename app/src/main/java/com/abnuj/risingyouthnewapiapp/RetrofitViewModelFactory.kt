package com.abnuj.risingyouthnewapiapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.abnuj.risingyouthnewapiapp.Repository.RetrofitRepository
import com.abnuj.risingyouthnewapiapp.ViewModel.RetrofitViewmodel

class RetrofitViewModelFactory(private val retrofitRepository: RetrofitRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RetrofitViewmodel(retrofitRepository) as T
    }
}