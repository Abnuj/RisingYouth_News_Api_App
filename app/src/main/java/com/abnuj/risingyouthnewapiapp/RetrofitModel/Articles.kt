package com.abnuj.risingyouthnewapiapp.RetrofitModel

import com.google.gson.annotations.SerializedName


data class Articles(
    @SerializedName("source")
    val source:SourceModel,
    val author:String,
    val title:String,
    val description:String,
    val url:String,
    val urlToImage:String,
    val publishedAt:String,
    val content:String
)
