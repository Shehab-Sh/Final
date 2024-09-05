package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class WorkManager3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_work_manager3)


        val startWork: Button = findViewById(R.id.start_work)
        startWork.setOnClickListener {

            val workRequest = PeriodicWorkRequestBuilder<WorkerM>(1, TimeUnit.HOURS).build()

              WorkManager.getInstance(this).enqueue(workRequest)
    }
    }
}