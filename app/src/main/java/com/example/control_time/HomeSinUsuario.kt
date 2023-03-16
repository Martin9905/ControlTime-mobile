package com.example.control_time

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeSinUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_sin_usuario)

        val createViewClick = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        createViewClick.setOnClickListener {
            val intent = Intent(this, CrearAlarmaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val hoyViewClick = findViewById<View>(R.id.view3)
        hoyViewClick.setOnClickListener {
            val intent = Intent(this, ListadoAlarmasDiaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val mañanaViewClick = findViewById<View>(R.id.view6)
        mañanaViewClick.setOnClickListener {
            val intent = Intent(this, ListadoAlarmasDiaUsuarioAnonimo::class.java)
            startActivity(intent)
        }

        val todasViewClick = findViewById<View>(R.id.view7)
        todasViewClick.setOnClickListener {
            val intent = Intent(this, ListadoTodasLasAlarmasUsuarioAnonimo::class.java)
            startActivity(intent)
        }

    }

}