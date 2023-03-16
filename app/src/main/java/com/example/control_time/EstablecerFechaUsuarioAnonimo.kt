package com.example.control_time

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class EstablecerFechaUsuarioAnonimo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_establecer_fecha_usuario_anonimo)

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main5)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, CrearAlarmaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

    }
}