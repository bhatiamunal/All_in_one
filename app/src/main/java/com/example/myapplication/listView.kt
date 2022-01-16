package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class listView : AppCompatActivity() {
    lateinit var emp:listViewDataDetail
    var alist = ArrayList<listViewData>();
    lateinit var lv: ListView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        lv = findViewById(R.id.lv)
        alist.add(listViewData(" Afghanistan", "652,860"))
        alist.add(listViewData( " Albania", "27,400"))
        alist.add(listViewData( " Algeria", "2,381,740"))
        alist.add(listViewData( " Andorra", "470"))

        var cadapter = listViewAdapter(this, alist)

        lv.isClickable = true
        lv.setOnItemClickListener{ parent,view,position,id->
            var intent1= Intent(
                this,
                listViewClickItem::class.java
            )

                emp= listViewDataDetail(

                    alist.get(position).countryName.toString(),alist.get(position).desc.toString()
                )
            intent1.putExtra("key",emp)
            //  intent1.putExtra("k1",ed1.text.toString())
            startActivity(intent1)
        }
        lv.adapter = cadapter
    }
}