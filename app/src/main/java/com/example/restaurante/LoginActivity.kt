package com.example.restaurante


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var etEmail:EditText
    private lateinit var etPass:EditText
    private lateinit var btnRegistrar:Button
    private lateinit var btnLogin:Button


    private lateinit var llAutenticar:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        etEmail=findViewById(R.id.et_Email)
        etPass=findViewById(R.id.et_Email)
        btnRegistrar=findViewById(R.id.btn_Registrar)
        btnLogin=findViewById(R.id.btn_Login)

        ejecutarAnalitica()
        setup()



    }


    fun ejecutarAnalitica(){

        val analicis:FirebaseAnalytics=FirebaseAnalytics.getInstance(this )
        val bundle=Bundle()
        bundle.putString("mensaje","Integracion de firebase completa")
        analicis.logEvent("InitScrean",bundle)




    }
//que se nos muestre de encabesado

    fun setup(){
        title="Autentificacion"


        btnRegistrar.setOnClickListener{

            if (etEmail.text.isNotEmpty()&&etPass.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    etEmail.text.toString(),etPass.text.toString()).addOnCompleteListener{

                    if (it.isSuccessful)   {

                        mostrarRegistrar(it?.result?.user?.email?:"", TipoProveedor.Cliente)



                    }else{
                        mostrarAlerta()

                    }

                }
            }
        }

        btnLogin.setOnClickListener{
            if (etEmail.text.isNotEmpty()&&etPass.text.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    etEmail.text.toString(),etPass.text.toString()).addOnCompleteListener{

                    if (it.isSuccessful)   {

                       saltarventanaamenu(it?.result?.user?.email?:"", TipoProveedor.Cliente)



                    }else{
                        mostrarAlerta()

                    }

                }
            }


        }



    }


    fun mostrarAlerta(){
        val builder=AlertDialog.Builder(this)
        builder.setTitle("Error conexion")
        builder.setMessage("Error asutenticacion de usuario")
        builder.setPositiveButton("Aceptar",null)
        val dialog=builder.create()
    }

    fun mostrarRegistrar(email:String,proveedor:TipoProveedor){

        val ventana:Intent=Intent(this,LoginActivity::class.java).apply {

            putExtra("email",email)
            putExtra("proveedor",proveedor.name).toString()


        }
        startActivity(ventana)
    }
    fun saltarventanaamenu(email:String,proveedor:TipoProveedor){

        val ventana:Intent=Intent(this,MainActivityMnu::class.java).apply {


        }
        startActivity(ventana)
    }

    enum class TipoProveedor{

        Cliente
    }


}
