package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class TonoAlarmaUsuarioAnonimo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tono_alarma_usuario_anonimo)

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main7)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, CrearAlarmaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val seleccionadoViewClick = findViewById<Button>(R.id.ingresar89)
        seleccionadoViewClick.setOnClickListener {
            val intent = Intent(this, HomeSinUsuario::class.java)
            startActivity(intent)
        }


    }
}