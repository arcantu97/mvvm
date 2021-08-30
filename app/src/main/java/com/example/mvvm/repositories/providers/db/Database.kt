package com.example.mvvm.repositories.providers.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvm.daos.QuoteDao
import com.example.mvvm.models.QuoteEntity

@Database(entities = [QuoteEntity::class], version = 1)
abstract class Database: RoomDatabase()  {
    abstract fun quoteDao(): QuoteDao

}