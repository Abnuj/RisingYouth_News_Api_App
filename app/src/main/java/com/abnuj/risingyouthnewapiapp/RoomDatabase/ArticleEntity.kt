package com.abnuj.risingyouthnewapiapp.RoomDatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ArticleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val author: String,
    val title: String,
    val content: String
)
