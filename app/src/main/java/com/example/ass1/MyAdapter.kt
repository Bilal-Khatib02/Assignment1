package com.example.ass1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*
class MyAdapter(private val userList : ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
         var user : User = userList[position]
        holder.address.text = user.address
        holder.userName.text = user.userName
        holder.number.text = user.number.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }


    public class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val address : TextView = itemView.findViewById(R.id.address)
        val userName : TextView = itemView.findViewById(R.id.tv_name)
        val number : TextView = itemView.findViewById(R.id.tv_number)
    }

}



*/