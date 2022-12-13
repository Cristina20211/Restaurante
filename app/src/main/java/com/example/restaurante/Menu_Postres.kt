package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Menu_Postres : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_postres)

    }

    //Funcion para seleccionar una combo

    fun selectPostre(Vista: View) {
        when (Vista.id) {

            R.id.btnpostre1 -> {
                Toast.makeText(this, "Has seleccionado combo1", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre1::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre2 -> {
                Toast.makeText(this, "Has seleccionado combo2", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre2::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre3 -> {
                Toast.makeText(this, "Has seleccionado combo3", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre3::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre4 -> {
                Toast.makeText(this, "Has seleccionado combo4", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre4::class.java)
                startActivity(newWindow)

            }

            R.id.btnpostre5 -> {
                Toast.makeText(this, "Has seleccionado combo5", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre5::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre6 -> {
                Toast.makeText(this, "Has seleccionado combo6", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre6::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre7 -> {
                Toast.makeText(this, "Has seleccionado combo7", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre7::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre8 -> {
                Toast.makeText(this, "Has seleccionado combo8", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre8::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre9 -> {
                Toast.makeText(this, "Has seleccionado combo9", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre9::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre10 -> {
                Toast.makeText(this, "Has seleccionado combo10", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre10::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre11 -> {
                Toast.makeText(this, "Has seleccionado combo11", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre11::class.java)
                startActivity(newWindow)

            }
            R.id.btnpostre12 -> {
                Toast.makeText(this, "Has seleccionado combo12", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, postre12::class.java)
                startActivity(newWindow)

            }
        }
    }


}