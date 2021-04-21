package com.abnuj.risingyouthnewapiapp.RoomDatabase

import androidx.lifecycle.LiveData

class NewsRepository(private var newsDao: NewsDao) {

    val readAlldata: LiveData<List<ArticleEntity?>> = newsDao.readAllData()

    fun addnews(articleEntity: List<ArticleEntity?>) {
        newsDao.addNews(articleEntity)
    }
}