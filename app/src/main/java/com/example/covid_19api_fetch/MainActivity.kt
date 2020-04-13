package com.example.covid_19api_fetch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_covid.layoutManager = LinearLayoutManager(this)

        Client.api.callsummary().enqueue(retrofitCallback{ throwable, response ->
            val adapter:userAdapter?= userAdapter(response?.body() as ArrayList<user>)
            rv_covid.adapter =adapter
        })
    }
}
