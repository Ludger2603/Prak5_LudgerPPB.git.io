package com.ludger.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDenganDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_dengan_data)
        val nama = intent.getStringExtra("nama")
        val umur = intent.getIntExtra("umur", 0)
        val tvNama = findViewById<TextView>(R.id.tv_nama)
        val tvUmur = findViewById<TextView>(R.id.tv_umur)
        tvNama.text = nama
        tvUmur.text = umur.toString()
    }
}