package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class ServiceActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_service2)
        val startButton = findViewById<CardView>(R.id.start_service_button)
        val stopButton = findViewById<CardView>(R.id.stop_service_button)

        startButton.setOnClickListener {
            val startIntent = Intent(this, AudioService::class.java)
            startService(startIntent)
        }

        stopButton.setOnClickListener {
            val stopIntent = Intent(this, AudioService::class.java)
            stopService(stopIntent)
        }
    }
}