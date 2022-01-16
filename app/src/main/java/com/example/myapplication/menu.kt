package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class menu : AppCompatActivity() {
    lateinit var textView: TextView;
    lateinit var listViewButton: Button;
    lateinit var RViewButton: Button;
    lateinit var alertButton: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val ss:String = intent.getStringExtra("userName").toString()
        //Toast.makeText(this,ss, Toast.LENGTH_SHORT).show();

        textView = findViewById<TextView>(R.id.tv)
        textView.text ="Welcome $ss";
        listViewButton = findViewById(R.id.lv)
        listViewButton.setOnClickListener {
            val lv = Intent(this, listView::class.java)
            // start your next activity
            startActivity(lv)
        }
        RViewButton = findViewById(R.id.rv)
        RViewButton.setOnClickListener {
           val rv = Intent(this, RecyclerViewIn::class.java)
            // start your next activity
           startActivity(rv)
        }
        alertButton = findViewById(R.id.alertBt)
        alertButton.setOnClickListener {
            val alertButton = Intent(this, AlertDialogActivity::class.java)
            // start your next activity
            startActivity(alertButton)
        }
    }
}