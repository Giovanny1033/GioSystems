package com.example.giosystems

import android.app.Activity
import android.app.Service
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.giosystems.model.AccountInfo

class AccountInfoListAdapter(val ctx: Activity, val data: List<AccountInfo>)
    : ArrayAdapter<AccountInfo>(ctx, R.layout.account_list, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = ctx.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.account_list, null)
        val title = view.findViewById<TextView>(R.id.accountTitle)
        title.text = data[position].title
        return view
    }
}