package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListadoTodasLasAlarmasUsuarioAnonimo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_alarmas_dia_usuario_anonimo)

        val crearViewClick = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        crearViewClick.setOnClickListener {
            val intent = Intent(this, CrearAlarmaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main3)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, HomeSinUsuario::class.java)
            startActivity(intent)
        }

        val detalleAlarmaAViewClick = findViewById<View>(R.id.view12)
        detalleAlarmaAViewClick.setOnClickListener {
            val intent = Intent(this, AlarmaDetalleUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val detalleAlarmaBViewClick = findViewById<View>(R.id.view13)
        detalleAlarmaBViewClick.setOnClickListener {
            val intent = Intent(this, AlarmaDetalleUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val detalleAlarmaCViewClick = findViewById<View>(R.id.view14)
        detalleAlarmaCViewClick.setOnClickListener {
            val intent = Intent(this, AlarmaDetalleUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val detalleAlarmaDViewClick = findViewById<View>(R.id.view15)
        detalleAlarmaDViewClick.setOnClickListener {
            val intent = Intent(this, AlarmaDetalleUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val detalleAlarmaEViewClick = findViewById<View>(R.id.view16)
        detalleAlarmaEViewClick.setOnClickListener {
            val intent = Intent(this, AlarmaDetalleUsuarioAnonimo::class.java)
            startActivity(intent)
        }

    }
}