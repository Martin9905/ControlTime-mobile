package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class AplicacionesABloquearUsuarioAnonimo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplicaciones_abloquear_usuario_anonimo)

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main6)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, CrearAlarmaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val aceptarViewClick = findViewById<Button>(R.id.ingresar2)
        aceptarViewClick.setOnClickListener {
            val intent = Intent(this, CrearAlarmaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

    }
}