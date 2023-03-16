package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonClick = findViewById<ImageButton>(R.id.back_main)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val textViewClick = findViewById<TextView>(R.id.textView2)
        textViewClick.setOnClickListener {
            val intent = Intent(this, RecuperarPasswordActivity::class.java)
            startActivity(intent)
        }

        val ingresarViewClick = findViewById<TextView>(R.id.ingresar)
        ingresarViewClick.setOnClickListener {
            val intent = Intent(this, HomeConUsuario::class.java)
            startActivity(intent)
        }

    }
}