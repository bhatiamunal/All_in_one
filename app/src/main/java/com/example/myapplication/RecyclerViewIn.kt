package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewIn : AppCompatActivity() {
    lateinit var rvId :RecyclerView;
    var clist = ArrayList<RecyclerViewData>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        rvId  = findViewById(R.id.rv)
        clist.add(RecyclerViewData("Title1","this describtion1"))
        clist.add(RecyclerViewData("Title2","this describtion2"))
        clist.add(RecyclerViewData("Title3","this describtion3"))

        var cadapter = RecyclerViewAdapter(this,clist)
        rvId.adapter = cadapter
        rvId.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}