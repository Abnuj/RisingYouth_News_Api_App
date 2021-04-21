package com.abnuj.risingyouthnewapiapp.RetrofitModel



data class RetrofitNewsModel(
    val status:String,
    val totalResults:Int,
    val articles: List<Articles?>
)
