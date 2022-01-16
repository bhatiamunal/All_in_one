package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter (var context: Context, var list:ArrayList<RecyclerViewData>): RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>(){
    inner class  RecyclerViewHolder(view: View):RecyclerView.ViewHolder(view){

        lateinit var countryName : TextView
        lateinit var countryDesc : TextView
        lateinit var checkbox: CheckBox
        init{
            countryName = view.findViewById(R.id.countryName)
            countryDesc = view.findViewById(R.id.countryDesc)
           checkbox = view.findViewById(R.id.checkbox_in)
        }
    }
    override fun getItemCount():Int{
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        var myView:View = LayoutInflater.from(context).inflate(R.layout.recyclerview_inflator,null)
        return RecyclerViewHolder(myView)
    }
    override fun onBindViewHolder(holder:RecyclerViewHolder,position:Int){
        holder.countryName.text = list.get(position).countryName
        holder.countryDesc.text = list.get(position).desc
//        holder.checkbox.isChecked = checkBoxStateArray.get(position,false)
 //       holder.imageView.setImageResource(list.get(position).image)

//        var data_postion = list.get(position).postion
//        holder.checkbox.text = "checkbox $data_postion"

        //list.isSelected()

    }
}