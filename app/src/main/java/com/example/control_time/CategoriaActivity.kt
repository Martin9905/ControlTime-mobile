package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class CategoriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria)

        val atrasViewClick = findViewById<ImageButton>(R.id.back_main9)
        atrasViewClick.setOnClickListener {
            val intent = Intent(this, HomeConUsuario::class.java)
            startActivity(intent)
        }

        val detalleCategoriaAViewClick = findViewById<View>(R.id.view11)
        detalleCategoriaAViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaBViewClick = findViewById<View>(R.id.view20)
        detalleCategoriaBViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaCViewClick = findViewById<View>(R.id.view31)
        detalleCategoriaCViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaDViewClick = findViewById<View>(R.id.view32)
        detalleCategoriaDViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaEViewClick = findViewById<View>(R.id.view34)
        detalleCategoriaEViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaFViewClick = findViewById<View>(R.id.view36)
        detalleCategoriaFViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaGViewClick = findViewById<View>(R.id.view35)
        detalleCategoriaGViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val detalleCategoriaHViewClick = findViewById<View>(R.id.view33)
        detalleCategoriaHViewClick.setOnClickListener {
            val intent = Intent(this, CategoriaDetalleActivity::class.java)
            startActivity(intent)
        }

        val crearCategoriaViewClick = findViewById<ImageButton>(R.id.floatingActionButton4)
        crearCategoriaViewClick.setOnClickListener {
            val intent = Intent(this, CrearCategoriaActivity::class.java)
            startActivity(intent)
        }


    }
}