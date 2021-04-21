package com.abnuj.risingyouthnewapiapp.Repository

import com.abnuj.risingyouthnewapiapp.API.RetrofitInstance
import com.abnuj.risingyouthnewapiapp.RetrofitModel.RetrofitNewsModel
import com.abnuj.risingyouthnewapiapp.Utils.Constants.Companion.API_KEY
import retrofit2.Response

class RetrofitRepository {
    suspend fun getLatestNews(): Response<RetrofitNewsModel> {
        return RetrofitInstance.api.getLatestNews("techcrunch", API_KEY)
    }
}