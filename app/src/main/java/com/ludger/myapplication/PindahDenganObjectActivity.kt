package com.ludger.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ludger.myapplication.model.Student

class PindahDenganObjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_dengan_object)
        val student = intent.getParcelableExtra<Student>("student")
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val umur = intent.getIntExtra("umur",0)
        val tvNim = findViewById<TextView>(R.id.tv_nim)
        val tvNama = findViewById<TextView>(R.id.tv_Nama)
        val tvUmur = findViewById<TextView>(R.id.tv_Umur)
        val tvLulus = findViewById<TextView>(R.id.tv_Lulus)
        // Menampilkan data student pada TextView
        tvNim.text = "NIM: ${student?.nim}"
        tvNama.text = "Nama: ${student?.nama}"
        tvUmur.text = "Umur: ${student?.umur}"

        // Menampilkan keterangan "Lulus" atau "Tidak Lulus" berdasarkan nilai isLulus
        val isLulusText = if (student?.isLulus == true) "Lulus" else "Tidak Lulus"
        tvLulus.text = "Status: $isLulusText"

    }
}