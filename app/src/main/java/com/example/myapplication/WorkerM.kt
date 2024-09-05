package com.example.myapplication

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Looper
import androidx.work.Worker
import androidx.work.WorkerParameters
import android.os.Handler
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class WorkerM(context: Context, workerParams: WorkerParameters) : androidx.work.Worker(context, workerParams) {
        override fun doWork(): Result {
            showNotification("Test", "Welcome!")
            return Result.success()
        }

        @SuppressLint("MissingPermission")
        private fun showNotification(title: String, message: String) {
            val notificationId = 1
            val channelId = "test"


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val channel = NotificationChannel(
                    channelId,
                    "test",
                    NotificationManager.IMPORTANCE_DEFAULT
                ).apply {
                    description = "test"
                }
                val notificationManager: NotificationManager =
                    applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.createNotificationChannel(channel)
            }

            val builder = NotificationCompat.Builder(applicationContext, channelId)
                .setSmallIcon(R.drawable.ageicon)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)

            // notification
            with(NotificationManagerCompat.from(applicationContext)) {
                notify(notificationId, builder.build())
            }
        }
    }
