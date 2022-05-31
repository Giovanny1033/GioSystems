package com.example.giosystems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.giosystems.databinding.ActivityMainBinding
import com.example.giosystems.model.AccountInfo


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // click_BotonLista()

        binding.btnShowName.setOnClickListener {
            Toast.makeText(this@MainActivity, binding.etName.text, Toast.LENGTH_LONG).show()
            Toast.makeText(this@MainActivity, binding.etPassword.text, Toast.LENGTH_LONG).show()
        }

        val etName = findViewById<EditText>(R.id.etName)
        val etPasswordCallback = findViewById<EditText>(R.id.etPassword)


    fun goToSecondActivity(){
        val myIntent = Intent(this, SecondActivity::class.java)
        startActivity(myIntent)
    }
}
}