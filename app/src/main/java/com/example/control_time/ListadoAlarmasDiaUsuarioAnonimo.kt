package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListadoAlarmasDiaUsuarioAnonimo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_todas_las_alarmas_usuario_anonimo)

        val crearViewClick = findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        crearViewClick.setOnClickListener {
            val intent = Intent(this, CrearAlarmaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main4)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, HomeSinUsuario::class.java)
            startActivity(intent)
        }

        val detalleAlarmaAViewClick = findViewById<View>(R.id.view21)
        detalleAlarmaAViewClick.setOnClickListener {
            val intent = Intent(this, AlarmaDetalleUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val detalleAlarmaBViewClick = findViewById<View>(R.id.view28)
        detalleAlarmaBViewClick.setOnClickListener {
            val intent = Intent(this, AlarmaDetalleUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val detalleAlarmaCViewClick = findViewById<View>(R.id.view29)
        detalleAlarmaCViewClick.setOnClickListener {
            val intent = Intent(this, AlarmaDetalleUsuarioAnonimo::class.java)
            startActivity(intent)
        }

    }

}