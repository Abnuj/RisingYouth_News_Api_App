package com.abnuj.risingyouthnewapiapp.RoomDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ArticleEntity::class], version = 1)

abstract class NewsDatabase : RoomDatabase() {

    abstract fun newsDao(): NewsDao

    companion object {
        @Volatile
        private var INSTACE: NewsDatabase? = null

        fun getDatabase(context: Context): NewsDatabase {
            val tempInstance = INSTACE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this)
            {
                val instance =
                    Room.databaseBuilder(context.applicationContext, NewsDatabase::class.java,"news_database")
                        .build()
                INSTACE = instance
                return instance
            }
        }
    }
}