package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Basic1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_basic1)
        val editText = findViewById<EditText>(R.id.edit_txt)
        val printButton = findViewById<AppCompatButton>(R.id.print)
        val printText = findViewById<TextView>(R.id.print_txt)

        printButton.setOnClickListener {
            val name = editText.text.toString()
            printText.text = "Hello, My name is $name!"

        }

}

}