package com.example.repositoriotareas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityCicloVida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_vida)
        Log.i("CicloVida", "Se esta llamado al metodo onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CicloVida","Se llama después de onCreate. Jose Maria muestra la pantalla pero el usuario aún no puede interaccionar")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CicloVida", "El usuario ya puede interaccionar con la pantalla")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CicloVida", "Se pierde el foco de la pantalla. Boton home")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CicloVida", "Vuelvo a estar visible para Jose Maria.")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CicloVida", "Dejo de estar visible para el usuario.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CicloVida", "La actividad muere.")
    }
}