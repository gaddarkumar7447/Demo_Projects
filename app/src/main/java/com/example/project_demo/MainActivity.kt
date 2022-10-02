package com.example.project_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.ActionMenuViewBindingAdapter
import com.example.project_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dataBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*dataBinding.button.setOnClickListener(View.OnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){dialogInterface , which ->
                Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No"){dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        })
        dataBinding.button1.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, Another :: class.java))
        })

        dataBinding.button3.setOnClickListener(
            View.OnClickListener {
                startActivity(Intent(this, TabLayout :: class.java))
            }
        )
        dataBinding.button4.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, Coroutines :: class.java))
        })*/


    }
}
