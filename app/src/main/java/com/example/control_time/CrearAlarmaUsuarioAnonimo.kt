package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CrearAlarmaUsuarioAnonimo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_alarma_usuario_anonimo)

        val creadoViewClick = findViewById<Button>(R.id.creado)
        creadoViewClick.setOnClickListener {
            val intent = Intent(this, HomeSinUsuario::class.java)
            startActivity(intent)
        }

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main2)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, HomeSinUsuario::class.java)
            startActivity(intent)
        }

        val fechaViewClick = findViewById<ImageButton>(R.id.imageButton)
        fechaViewClick.setOnClickListener {
            val intent = Intent(this, EstablecerFechaUsuarioAnonimo::class.java)
            startActivity(intent)
        }


        val bloquearViewClick = findViewById<Button>(R.id.button2)
        bloquearViewClick.setOnClickListener {
            val intent = Intent(this, AplicacionesABloquearUsuarioAnonimo::class.java)
            startActivity(intent)
        }



    }

}