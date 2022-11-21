package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ScrollViewApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mnu)


    }
    fun seleccionaComida(Vista: View){

        when(Vista.id){
            R.id.btnPizza-> Toast.makeText(this, "son Hamburguesa", Toast.LENGTH_SHORT).show()
            R.id.btnBurger-> Toast.makeText(this, "son tacos", Toast.LENGTH_SHORT).show()
            R.id.btnHotDog-> Toast.makeText(this, "son salchipapas", Toast.LENGTH_SHORT).show()
            R.id.btnRefresco-> Toast.makeText(this, "son cervezas", Toast.LENGTH_SHORT).show()


        }
    }


}