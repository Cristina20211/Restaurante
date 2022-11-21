package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var vpVistaPager: ViewPager2
    private lateinit var vlVistaTabla: TabLayout

    //crearemos adaptador q se inicie cuando lo necesitaremos

    private val adaptador by lazy {

        vpAdaptador(this )

    }

    //El adaptador se inicializa si o si
    // private val adaptador2=vpAdaptador(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //vinculacion de variables


        vpVistaPager=findViewById(R.id.vp_VistaPager)
        vlVistaTabla=findViewById(R.id.tl_VistaTablero)


        vpVistaPager.adapter=adaptador


        //catgar el tab


        val medidorTabla= TabLayoutMediator(vlVistaTabla, vpVistaPager,
            TabLayoutMediator.TabConfigurationStrategy({
                    tab, position ->
                when(position){
                    0->{
                        tab.text="Sucursales"
                        tab.setIcon(R.drawable.sucursal )
                        val badge: BadgeDrawable =tab.orCreateBadge
                        badge.backgroundColor= ContextCompat.getColor(applicationContext,R.color.micolor)
                        badge.isVisible

                    }
                    1 ->{
                        tab.text="Vision Mision"
                        tab.setIcon(R.drawable.vimi)
                        val badge: BadgeDrawable =tab.orCreateBadge
                        badge.backgroundColor= ContextCompat.getColor(applicationContext,R.color.micolor)
                        badge.number=2
                        badge.isVisible
                    }
                    2 ->{
                        tab.text="Politicas"
                        tab.setIcon(R.drawable.politicas)
                        val badge: BadgeDrawable =tab.orCreateBadge
                        badge.backgroundColor= ContextCompat.getColor(applicationContext,R.color.micolor)
                        badge.number=14
                        badge.maxCharacterCount=3
                        badge.isVisible

                    }
                }




            })


        )
        medidorTabla.attach()


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.app_menu,menu)
        //return super.onCreateOptionsMenu(menu)
        return true
    }




    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //return super.onOptionsItemSelected(item)
        when (item.itemId){


            R.id.miMenu->{
                Toast.makeText(this, "has seleccionado menu", Toast.LENGTH_SHORT).show()
                val newWindow: Intent = Intent(applicationContext,MainActivityMnu::class.java)
                startActivity(newWindow)
            }

            R.id.miContactos->{
                Toast.makeText(this, "has seleccionado contactos", Toast.LENGTH_SHORT).show()
                val newWindow: Intent = Intent(applicationContext,ScrollContactos::class.java)
                startActivity(newWindow)
            }
            R.id.miAyuda->{
                Toast.makeText(this, "has seleccionado ayuda ", Toast.LENGTH_SHORT).show()
                val newWindow: Intent = Intent(applicationContext,ScrollAyuda::class.java)
                startActivity(newWindow)
            }
            R.id.misalir->{
                finish()
            }


        }
        return true



    }


}