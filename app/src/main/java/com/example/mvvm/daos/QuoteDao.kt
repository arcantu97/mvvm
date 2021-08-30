package com.example.mvvm.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mvvm.models.QuoteModel

@Dao
interface QuoteDao {

    @Query("SELECT * FROM quotes")
    fun getQuote(): QuoteModel

    @Insert
    fun insertQuote(author: String, quote: String)

    @Query("DELETE FROM quotes WHERE id = :itemId")
    fun deleteQuote(itemId: Int)
}