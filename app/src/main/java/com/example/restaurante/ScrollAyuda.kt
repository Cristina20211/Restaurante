package com.example.restaurante

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

            R.id.Interfaz->

                Toast.makeText(this, "quieres ayuda con la interfaz", Toast.LENGTH_SHORT).show()

            R.id.quejas->

                Toast.makeText(this, "puedes dejar tus quejas aqui", Toast.LENGTH_SHORT).show()

            R.id.CriticasConstructivas->

                Toast.makeText(this, "algo que te gustaria que mejoremos", Toast.LENGTH_SHORT).show()


        }
    }
}