//package com.ludger.myapplication
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//import android.widget.Toast
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val btnCounter = findViewById<Button>(R.id.Btn_Counter)
//        val tvCounter : TextView = findViewById(R.id.tv_Counter)
//        var counter = 0
//        btnCounter.setOnClickListener {
//            counter++
//            tvCounter.text = counter.toString()
//            Toast.makeText(
//                this,
//                "tombol di klik",
//                Toast.LENGTH_LONG
//            ).show()
//        }
//    }
//}