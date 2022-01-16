package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class listViewClickItem : AppCompatActivity() {
    lateinit var tv1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_click_item)

        tv1=findViewById(R.id.intentedDataListView)
        var emp:listViewDataDetail=intent.getSerializableExtra("key") as listViewDataDetail
        tv1.text="Country Name ${emp.countryName} and Desc is ${emp.desc} "

    }
}