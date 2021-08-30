package com.example.mvvm.daos

import androidx.room.*
import com.example.mvvm.models.QuoteEntity
import com.example.mvvm.models.QuoteModel

@Dao
interface QuoteDao {
    @Query("SELECT * FROM quotes")
    fun getQuotes(): MutableList<QuoteEntity>

    @Insert
    fun insertQuote(quoteEntity: QuoteEntity)


    @Delete
    fun deleteQuote(quoteEntity: QuoteEntity)
}