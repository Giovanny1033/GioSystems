package com.example.giosystems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ListView
import com.example.giosystems.model.AccountInfo

class MainActivity : AppCompatActivity() {

    val accountList = listOf<AccountInfo>(
        AccountInfo("Netflix", "netflix", "13000 38000"),
        AccountInfo("Disney +", "disney", "5000 11000"),
        AccountInfo("Amazon Prime", "amazon", "5000 8000"),
        AccountInfo("HBO MAX", "hbo", "6000 11000"),
        AccountInfo("STAR +", "star", "6000 11000")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.myButton) as ImageButton
        btn.setOnClickListener{goToSecondActivity()}


        val adapter = AccountInfoListAdapter(this, accountList)
        val listView = findViewById<ListView>(R.id.accountList)
        listView.adapter = adapter
        listView.setOnItemClickListener { _, view, position, _ ->
        openAccountDetail(accountList[position])
    }
    }
    fun openAccountDetail(account: AccountInfo){
        // open a second activity
        val goto = Intent(this, AccountInfoActivity::class.java)
        goto.putExtra("ACCOUNT_NAME", account)
        startActivity(goto)
    }

    fun goToSecondActivity(){
        val myIntent = Intent(this, SecondActivity::class.java)
        startActivity(myIntent)
    }
}