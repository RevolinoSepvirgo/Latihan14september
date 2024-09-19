package com.example.latihan14sep

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnTI : Button
    private lateinit var btnM  : Button
    private lateinit var btnPhoto : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        btnTI = findViewById(R.id.btnTI)
        btnM = findViewById(R.id.btnM)
        btnPhoto = findViewById(R.id.btnPhoto)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnTI.setOnClickListener {
            val intent = Intent(this, TIActivity::class.java)
            startActivity(intent)
        }

       btnM.setOnClickListener {
            val intent = Intent(this, MesinActivity::class.java)
            startActivity(intent)
        }

        btnPhoto.setOnClickListener {
            val intent = Intent(this, GaleriPhotoactivity::class.java)
            startActivity(intent)
        }
    }
}