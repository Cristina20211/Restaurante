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
            R.id.btncombo1-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo2-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo3-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo4-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo5-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo6-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo7-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo8-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo9-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo10-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo11-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()
            R.id.btncombo12-> Toast.makeText(this, "combo", Toast.LENGTH_SHORT).show()




        }
    }


}