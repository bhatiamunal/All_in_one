package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView;
    lateinit var userName: EditText
    lateinit var password: EditText
    lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.tv)
        userName = findViewById(R.id.username);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.login)
        textView.text ="Welcome To All In One";
        submit.setOnClickListener {
            if(userName.text.toString() =="munalbhatia" && password.text.toString()=="123"){
                val intent = Intent(this, menu::class.java)
                intent.putExtra("userName", userName.text.toString())
                // start your next activity
                startActivity(intent)
            }
            else {
                Toast.makeText(this,"Please Enter Correct Id and Password", Toast.LENGTH_SHORT).show();
            }

        }
    }
}