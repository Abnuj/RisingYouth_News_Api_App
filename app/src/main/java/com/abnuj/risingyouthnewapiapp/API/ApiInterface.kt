package com.abnuj.risingyouthnewapiapp.API

import com.abnuj.risingyouthnewapiapp.RetrofitModel.RetrofitNewsModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("top-headlines")
   suspend fun getLatestNews(
        @Query("sources") source:String,
        @Query("apiKey") apikey:String
    ): Response<RetrofitNewsModel>

}