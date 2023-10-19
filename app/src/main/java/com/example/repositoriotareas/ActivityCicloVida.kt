package com.example.repositoriotareas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "ActivityCicloVida"

class ActivityCicloVida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_vida)
        Log.d(TAG, "Se esta llamado al metodo onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(
            TAG,
            "Se llama después de onCreate. Jose Maria muestra la pantalla pero el usuario aún no puede interaccionar"
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "El usuario ya puede interaccionar con la pantalla")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Se pierde el foco de la pantalla. Boton home")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Vuelvo a estar visible para Jose Maria.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Dejo de estar visible para el usuario.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "La actividad muere.")
    }
}