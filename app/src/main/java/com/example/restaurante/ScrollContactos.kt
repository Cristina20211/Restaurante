package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ScrollContactos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_contactos)
    }

    fun seleccionaContactos(Vista: View){

        when(Vista.id){
            R.id.telefono ->
            {
                Toast.makeText(this, "Has seleccionado telefono", Toast.LENGTH_SHORT).show()
                val newWindow: Intent = Intent(applicationContext,tel::class.java)
                startActivity(newWindow)

            }


            R.id.instagram ->
            {
                Toast.makeText(this, "Has seleccionado instagram", Toast.LENGTH_SHORT).show()
                val newWindow: Intent = Intent(applicationContext,insta::class.java)
                startActivity(newWindow)

            }


            R.id.facebook->

        {
            Toast.makeText(this, "Has seleccionado faceboock", Toast.LENGTH_SHORT).show()
            val newWindow: Intent = Intent(applicationContext,facecont::class.java)
            startActivity(newWindow)

        }

            R.id.twitter->

        {
            Toast.makeText(this, "Has seleccionado twitter", Toast.LENGTH_SHORT).show()
            val newWindow: Intent = Intent(applicationContext,twittercontact::class.java)
            startActivity(newWindow)

        }

        }
    }
}


