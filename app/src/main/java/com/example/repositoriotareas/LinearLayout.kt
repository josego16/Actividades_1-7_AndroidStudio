package com.example.repositoriotareas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        val boton: Button = findViewById(R.id.button)

        boton.setOnClickListener {
            val accion = Intent(this, MainActivity::class.java)
            startActivity(accion)
        }
    }
}