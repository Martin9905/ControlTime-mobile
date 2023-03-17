package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeConUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_con_usuario)

        val verMasViewClick = findViewById<TextView>(R.id.textView91)
        verMasViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaAViewClick = findViewById<View>(R.id.view19)
        detalleCategoriaAViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaBViewClick = findViewById<View>(R.id.view22)
        detalleCategoriaBViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaCViewClick = findViewById<View>(R.id.view23)
        detalleCategoriaCViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

    }
}