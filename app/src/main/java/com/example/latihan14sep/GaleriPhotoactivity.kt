package com.example.latihan14sep

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GaleriPhotoactivity : AppCompatActivity() {
    private lateinit var gambar1 : ImageView
    private lateinit var gambar2 : ImageView
    private lateinit var gambar3 : ImageView
    private lateinit var gambar4 : ImageView
    private lateinit var gambar5 : ImageView
    private lateinit var gambar6 : ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galeri_photoactivity)

        gambar1 = findViewById(R.id.gambar1)
        gambar2 = findViewById(R.id.gambar2)
        gambar3 = findViewById(R.id.gambar3)
        gambar4 = findViewById(R.id.gambar4)
        gambar5 = findViewById(R.id.gambar5)
        gambar6 = findViewById(R.id.gambar6)





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        gambar1.setOnClickListener {
            val intent = Intent(this, detail::class.java)
            startActivity(intent)
        }
        gambar2.setOnClickListener {
            val intent = Intent(this, detail2::class.java)
            startActivity(intent)
        }
        gambar3.setOnClickListener {
            val intent = Intent(this, detail3::class.java)
            startActivity(intent)
        }
        gambar4.setOnClickListener {
            val intent = Intent(this, detail4::class.java)
            startActivity(intent)
        }
        gambar5.setOnClickListener {
            val intent = Intent(this, detail5::class.java)
            startActivity(intent)
        }
        gambar6.setOnClickListener {
            val intent = Intent(this, detail6::class.java)
            startActivity(intent)
        }

    }
}