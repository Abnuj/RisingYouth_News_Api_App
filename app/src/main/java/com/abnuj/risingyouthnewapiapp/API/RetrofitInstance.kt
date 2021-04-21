package com.abnuj.risingyouthnewapiapp.API

import com.abnuj.risingyouthnewapiapp.Utils.Constants.Companion.BASE_URL
import com.google.gson.internal.`$Gson$Preconditions`
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api:ApiInterface by lazy {
        retrofit.create(ApiInterface::class.java)
    }
}