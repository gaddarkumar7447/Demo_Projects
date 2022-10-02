package com.example.project_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Coroutines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)

        CoroutineScope(Dispatchers.IO).launch {
            printFollowers()
        }
    }

    private fun printFollowers() {
        var fbFollower = 0
        CoroutineScope(Dispatchers.IO).launch {
            fbFollower = getFbFlower()
        }
        Log.d("Tag", fbFollower.toString())
    }

    private fun getFbFlower(): Int {
        return 54
    }
}