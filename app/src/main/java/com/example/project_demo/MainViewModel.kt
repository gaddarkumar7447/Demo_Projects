package com.example.project_demo

import android.content.Context
import androidx.lifecycle.ViewModel
import com.google.gson.Gson

class MainViewModel(val context: Context) : ViewModel() {
    private var quotesList : Array<Quote> = emptyArray()
    private var index = 0

    init {
        quotesList = loadQuotesFromAsset()
    }

    private fun loadQuotesFromAsset(): Array<Quote> {
        val inputStream = context.assets.open("quotes.json")
        val size : Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gsonForm = Gson()
        return gsonForm.fromJson(json, Array<Quote> ::class.java)
    }


    fun getQuotes() = quotesList[index]
    fun nextQuotes() = quotesList[++index]
    fun previousQuotes() = quotesList[--index]

}