package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CategoriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria)

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main9)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, HomeConUsuario::class.java)
            startActivity(intent)
        }


    }
}