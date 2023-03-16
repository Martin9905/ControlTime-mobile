package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class RecuperarPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_password)

        val buttonClick = findViewById<ImageButton>(R.id.back_login)
        buttonClick.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val messageClick = findViewById<Button>(R.id.button)
        messageClick.setOnClickListener {
            val intent = Intent(this, RecuperarPasswordMessageActivity::class.java)
            startActivity(intent)
        }

    }
}