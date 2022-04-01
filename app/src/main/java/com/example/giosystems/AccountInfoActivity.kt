package com.example.giosystems

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.giosystems.R.id
import com.example.giosystems.model.AccountInfo

class AccountInfoActivity : AppCompatActivity() {
    var account = AccountInfo(" ", " ", " ")
    fun OnCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_info)

        account = intent.getSerializableExtra("ACCOUNT_NAME") as AccountInfo
        updateAccountName()
    }

    fun updateAccountName(){
        val imgid = resources.getIdentifier(account.photo, "drawable", this.packageName)
        findViewById<TextView>(id.accountTitle).text = account.title
        findViewById<TextView>(id.accountSynopsis).text = account.synopsis
        findViewById<ImageView>(id.accountImage).setImageResource(imgid)
    }
}