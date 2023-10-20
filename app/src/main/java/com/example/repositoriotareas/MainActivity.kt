package com.example.repositoriotareas

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var btnSaludo: Button
    private lateinit var btnNoSaludo: Button
    private lateinit var btnSaludoClase: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSaludo = findViewById(R.id.btnSaludo)
        btnNoSaludo = findViewById(R.id.btnNoSaludo)
        btnSaludoClase = findViewById(R.id.btnSaludoClase)

        initEvent()
    }

    override fun onStart() {
        super.onStart()
        val persona = ClaseA("josema", "gomez", 22)
        persona.nombre = "jaime"
        persona.apellidos = "gomez"
        persona.edad = 19
        Toast.makeText(this, persona.toString(), Toast.LENGTH_SHORT).show()
    }

    /**
     * Primera forma creando el evento onclick desde el xml
     */
    fun saludarJosema(view: View) {
        when (view.id) {
            R.id.btnSaludo -> {
                Toast.makeText(this, "Hola jose maria", Toast.LENGTH_LONG).show()
            }
            R.id.btnNoSaludo -> {
                Toast.makeText(this, "No voy a saludar a jose maria", Toast.LENGTH_LONG).show()
            }
            R.id.btnSaludoClase -> {
                Toast.makeText(this, "Buenos dias clase de jose maria", Toast.LENGTH_LONG).show()
            }
        }
    }

    /**
     * Segunda forma desde el main activity
     */
    override fun onClick(vista: View?) {
        when (vista?.id) {
            R.id.btnSaludo -> {
                Toast.makeText(this, "Hola jose maria", Toast.LENGTH_LONG).show()
            }
            R.id.btnNoSaludo -> {
                Toast.makeText(this, "No voy a saludar a jose maria", Toast.LENGTH_LONG).show()
            }
            R.id.btnSaludoClase -> {
                Toast.makeText(this, "Buenos dias clase de jose maria", Toast.LENGTH_LONG).show()
            }
        }
    }

    /**
     * Tercera forma con expresiones lambda
     */
    private fun initEvent() {
        btnSaludo.setOnClickListener {
            Toast.makeText(this, "Hola jose maria", Toast.LENGTH_LONG).show()
        }
        btnNoSaludo.setOnClickListener {
            Toast.makeText(this, "No voy a saludar a jose maria", Toast.LENGTH_LONG).show()
        }
        btnSaludoClase.setOnClickListener {
            Toast.makeText(this, "Buenos dias clase de jose maria", Toast.LENGTH_LONG).show()
        }
    }
}
