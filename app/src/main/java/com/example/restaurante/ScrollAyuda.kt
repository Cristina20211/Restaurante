package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ScrollAyuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_ayuda)
    }

    fun seleccionaAyuda(Vista: View){

        when(Vista.id){


                R.id.Interfaz ->
        {
            Toast.makeText(this, "quieres ayuda con la interfaz", Toast.LENGTH_SHORT).show()

            val newWindow: Intent = Intent(applicationContext,AyudaInterfaz::class.java)
            startActivity(newWindow)

        }

        }
    }
}