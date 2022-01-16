package com.example.myapplication

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class listViewAdapter(private val context: Context, private val arrayList: ArrayList<listViewData>) : BaseAdapter() {
    lateinit var emp:listViewDataDetail
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var myView: View = LayoutInflater.from(context).inflate(R.layout.listview_inflator, null)
        myView.findViewById<TextView>(R.id.countryName).text =   arrayList.get(position).countryName
        myView.findViewById<TextView>(R.id.desc).text =   arrayList.get(position).desc
//        myView.findViewById<Button>(R.id.btn).setOnClickListener {
//            var intent1= Intent(
//                this,
//                listViewClickItem::class.java
//            )
//
////            emp= listViewDataDetail( arrayList.get(position).countryName.toString(),arrayList.get(position).desc.toString())
////            intent1.putExtra("key",emp)
//            //  intent1.putExtra("k1",ed1.text.toString())
//            startActivity(intent1)
//        }
        return myView
    }
}