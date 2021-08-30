package com.example.mvvm.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.models.QuoteModel
import com.example.mvvm.repositories.providers.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel: MutableLiveData<QuoteModel> by lazy {
        MutableLiveData<QuoteModel>()
    }

    fun getRandomQuote(): Unit = quoteModel.postValue(QuoteProvider.getQuote())
}