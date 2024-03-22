package com.ludger.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ludger.myapplication.model.Student

class MainActivity2 : AppCompatActivity() {
    //Variable global
    lateinit var btnPindah: Button
    lateinit var btnPindahDenganData: Button
    lateinit var btnPindahDenganObject: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnPindah = findViewById(R.id.btn_pindah)
        btnPindahDenganData = findViewById(R.id.btn_pindah_dengan_data)
        btnPindahDenganObject = findViewById(R.id.btn_pindah_dengan_object)

        actionButtonPindahDenganData()
        actionButtonPindahDenganObject()
        actionButtonPindah()
    }

    fun actionButtonPindahDenganData() {
        btnPindahDenganData.setOnClickListener {
            val intent = Intent(this, PindahDenganDataActivity::class.java)
            intent.putExtra("nama", "Ludger")
            intent.putExtra("umur", "22")
            startActivity(intent)
        }
    }

    fun actionButtonPindah() {
        btnPindah.setOnClickListener {
            val intent = Intent(this, PindahActivity::class.java)
            startActivity(intent)
        }


    }fun actionButtonPindahDenganObject() {
        val student = Student(
            "2242102010",
            "Ludger",
            34,
            true
        )
        btnPindahDenganObject.setOnClickListener {
            val intent = Intent(this, PindahDenganObjectActivity::class.java)
            intent.putExtra("student", student)
            startActivity(intent)
        }
    }
}

