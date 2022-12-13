package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivityMnu : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mnu)

    }

    //Funcion para seleccionar una combo

    fun selectComida(Vista: View){
        when(Vista.id){

            R.id.btncombo1 ->
            {
                Toast.makeText(this, "Has seleccionado combo1", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,combo1::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo2->
            {
                Toast.makeText(this, "Has seleccionado combo2", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo2::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo3 ->
            {
                Toast.makeText(this, "Has seleccionado combo3", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo3::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo4 ->
            {
                Toast.makeText(this, "Has seleccionado combo4", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo4::class.java)
                startActivity(newWindow)

            }

            R.id.btncombo5 ->
            {
                Toast.makeText(this, "Has seleccionado combo5", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo5::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo6 ->
            {
                Toast.makeText(this, "Has seleccionado combo6", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo6::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo7 ->
            {
                Toast.makeText(this, "Has seleccionado combo7", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo7::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo8 ->
            {
                Toast.makeText(this, "Has seleccionado combo8", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo8::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo9 ->
            {
                Toast.makeText(this, "Has seleccionado combo9", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo9::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo10 ->
            {
                Toast.makeText(this, "Has seleccionado combo10", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo10::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo11 ->
            {
                Toast.makeText(this, "Has seleccionado combo11", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo11::class.java)
                startActivity(newWindow)

            }
            R.id.btncombo12 ->
            {
                Toast.makeText(this, "Has seleccionado combo12", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext,Combo12::class.java)
                startActivity(newWindow)

            }
        }
    }



    fun perfil(Vista: View) {

        when (Vista.id) {

            R.id.btn_perfil3-> {
                Toast.makeText(this, "Has seleccionado redirigirte a contactos", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, ScrollContactos::class.java)
                startActivity(newWindow)

            }
        }
    }
    fun postres(Vista: View) {

        when (Vista.id) {

            R.id.btn_postre-> {
                Toast.makeText(this, "Has seleccionado redirigirte postres", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, Menu_Postres::class.java)
                startActivity(newWindow)

            }
        }
    }


    fun inicio (Vista: View) {

        when (Vista.id) {

            R.id.btn_home -> {
                Toast.makeText(this, "Has seleccionado redirigirte al inicio", Toast.LENGTH_SHORT).show()

                val newWindow: Intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(newWindow)

            }
        }
    }

}