package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    var btmnav: ImageView? = null
    var home: RelativeLayout? = null ; var contact: RelativeLayout? = null
    var cal1: CardView? = null ;var cal2: CardView? = null ;var cal3: CardView? = null; var cal4: CardView? = null; var cal5: CardView? = null; var cal6: CardView? = null ; var cal7: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        cal1 = findViewById<View>(R.id.cal1) as CardView
        cal1!!.setOnClickListener {
            val i = Intent(
                this@MainActivity,Basic1Activity::class.java
            )
            startActivity(i)
        }

        cal2 = findViewById<View>(R.id.cal2) as CardView
        cal2!!.setOnClickListener {
            val i = Intent(
                this@MainActivity,
                ServiceActivity2::class.java
            )
            startActivity(i)
        }


        cal3 = findViewById<View>(R.id.cal3) as CardView
        cal3!!.setOnClickListener {
            val i = Intent(
                this@MainActivity,
                WorkManager3::class.java
            )
            startActivity(i)
        }


        cal4 = findViewById<View>(R.id.cal4) as CardView
        cal4!!.setOnClickListener {
            val i = Intent(
                this@MainActivity,
                Permissions4::class.java
            )
            startActivity(i)
        }

        cal5 = findViewById<View>(R.id.cal5) as CardView
        cal5!!.setOnClickListener {
            val i = Intent(
                this@MainActivity,
                ThreadsCoroutines5::class.java
            )
            startActivity(i)
        }


        cal6 = findViewById<View>(R.id.cal6) as CardView
        cal6!!.setOnClickListener {
            val i = Intent(
                this@MainActivity,
                Firebase6::class.java
            )
            startActivity(i)
        }

//
//        cal7 = findViewById<View>(R.id.cal7) as CardView
//        cal7!!.setOnClickListener {
//            val i = Intent(
//                this@MainActivity,
//                Api::class.java
//            )
//            startActivity(i)
//        }
    }
}