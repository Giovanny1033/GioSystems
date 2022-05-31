package com.example.giosystems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.giosystems.databinding.ActivityMainBinding
import com.example.giosystems.databinding.FragmentFirstBinding
import com.example.giosystems.model.AccountInfo

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var _binding: FirstActivityBinding? = null
    private val binding get() = _binding!!

    val accountList = listOf<AccountInfo>(
        AccountInfo("Netflix", "netflix", "13000 38000"),
        AccountInfo("Disney +", "disney", "5000 11000"),
        AccountInfo("Amazon Prime", "amazon", "5000 8000"),
        AccountInfo("HBO MAX", "hbo", "6000 11000"),
        AccountInfo("STAR +", "star", "6000 11000")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        return (binding.root)

        //val adapter = AccountInfoListAdapter(this, accountList)
        val listView = findViewById<ListView>(R.id.accountList)
        //listView.adapter = adapter
        listView.setOnItemClickListener { _, view, position, _ ->
            val tv = view as TextView
            openAccountDetail(tv.text.toString())
        }
    }
    fun openAccountDetail(accountName: String){
        // open a second activity
        val goto = Intent(this, AccountInfoActivity::class.java)
        goto.putExtra("ACCOUNT_NAME", accountName)
        startActivity(goto)
    }



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