package com.kamrujjamanjoy.recyclerviewinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

data class MyAdapter(val context: Context, val hobbies:List<Hobby>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setDataHobby(hobby,position)

    }



    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun setDataHobby(hobby: Hobby, position: Int) {
            itemView.title.text = hobby!!.title

        }

    }


}