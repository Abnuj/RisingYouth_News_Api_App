package com.abnuj.risingyouthnewapiapp.RoomDatabase

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addNews(articleEntity: List<ArticleEntity?>)

    @Query("SELECT * FROM  ArticleEntity ORDER BY id ASC")
    fun readAllData(): LiveData<List<ArticleEntity?>>

}