package com.example.repositoriotareas

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val persona = ClaseA("josema", "gomez", 22)
        persona.nombre = "jaime"
        persona.apellidos = "gomez"
        persona.edad = 19
        Toast.makeText(this, persona.toString(), Toast.LENGTH_SHORT).show()
    }
}