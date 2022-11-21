package com.example.restaurante

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivityMnu : AppCompatActivity() {

    var TYPEUSER=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mnu)

    }

    //Funcion para seleccionar una marca

    fun selectComida(Vista: View){
        when(Vista.id){

            R.id.btnPizza ->
            {
                Toast.makeText(this, "Has seleccionado pizza", Toast.LENGTH_SHORT).show()
                val newWindow: Intent = Intent(applicationContext,ScrollAyuda::class.java)
                startActivity(newWindow)

            }
            R.id.btnBurger ->
            {
                Toast.makeText(this, "Has seleccionado una burger", Toast.LENGTH_SHORT).show()

            }
            R.id.btnHotDog ->
            {
                Toast.makeText(this, "Has seleccionado hotdog", Toast.LENGTH_SHORT).show()

            }
            R.id.btnRefresco->
            {
                Toast.makeText(this, "Has seleccionado refrescos", Toast.LENGTH_SHORT).show()

            }
        }
    }

}