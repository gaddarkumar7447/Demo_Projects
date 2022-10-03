package com.example.project_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.ActionMenuViewBindingAdapter
import androidx.lifecycle.ViewModelProvider
import com.example.project_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dataBinding : ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(application))[MainViewModel::class.java]

        setQuotes(mainViewModel.getQuotes())
        previousButton()
        nextButton()
        sendText()
    }

    private fun setQuotes(quotes : Quote){
        dataBinding.quoteText.text = quotes.text
        dataBinding.quoteAuthor.text = quotes.author
    }

    private fun previousButton(){
        dataBinding.previousButton.setOnClickListener(View.OnClickListener {
            setQuotes(mainViewModel.previousQuotes())
        })
    }

    private fun nextButton(){
        dataBinding.nextButton.setOnClickListener(View.OnClickListener {
            setQuotes(mainViewModel.nextQuotes())
        })
    }
    private fun sendText(){
        dataBinding.floatingActionButton.setOnClickListener(View.OnClickListener {
            val send = Intent(Intent.ACTION_SEND)
            send.action = "text/plain"
            send.putExtra(Intent.EXTRA_TEXT, mainViewModel.getQuotes().text)
            startActivity(send)
        })
    }
}
