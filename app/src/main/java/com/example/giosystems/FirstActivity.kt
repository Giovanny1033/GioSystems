package com.example.giosystems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        btnShowName.setOnClickListener { }
    }

    fun checkValue(){
        if(etName.text.isNotEmpty()){
            //Vamos a la siguiente pantalla
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("INTENT_NAME", etName.text)
            startActivity(intent)
        }else{
            //Mostramos un diálogo

        }
    }

    fun showErrorName(){
        Toast.makeText(this, "El nombre del usuario no puede ser vacío", Toast.LENGTH_SHORT).show()
    }
}