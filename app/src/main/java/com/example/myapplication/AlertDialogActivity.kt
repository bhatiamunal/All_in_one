package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import android.app.AlertDialog
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AlertDialogActivity : AppCompatActivity() {

    lateinit var myButton: Button
    lateinit var alertDialog: AlertDialog.Builder
    lateinit var tv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        myButton=findViewById(R.id.alertBt)
        tv1=findViewById(R.id.textView3)


        myButton.setOnClickListener {

            alertDialog=AlertDialog.Builder(this)

            alertDialog.setTitle("this is text in dailog box ")

            var myView= LayoutInflater.from(this).inflate(R.layout.activity_layout_alertdialog,null)
            //performing positive action
            alertDialog.setPositiveButton("Yes"){dialogInterface, which ->
                var str=  myView.findViewById<EditText>(R.id.dailogBoxTextFeild).text.toString()
                tv1.text="Hello $str"
                //Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
            }
            //performing cancel action
            alertDialog.setNeutralButton("Cancel"){dialogInterface , which ->
                Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
            }
            //performing negative action
            alertDialog.setNegativeButton("No"){dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
            }
            // Create the AlertDialog
            val alertDialog: AlertDialog = alertDialog.create()
            alertDialog.setView(myView)
            // Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

    }
}