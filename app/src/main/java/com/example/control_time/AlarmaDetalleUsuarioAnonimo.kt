package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AlarmaDetalleUsuarioAnonimo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarma_detalle_usuario_anonimo)

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main8)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, HomeSinUsuario::class.java)
            startActivity(intent)
        }

    }
}