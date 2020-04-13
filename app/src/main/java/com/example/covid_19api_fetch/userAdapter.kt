package com.example.covid_19api_fetch

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class userAdapter(val arraylist:ArrayList<user>): RecyclerView.Adapter<userAdapter.userView>() {
    class userView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name:TextView = itemView.findViewById(R.id.id_name)
        var descrption:TextView = itemView.findViewById(R.id.id_description)
        var path:TextView = itemView.findViewById(R.id.id_path)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userView {
        val inflator = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return userView(inflator)
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: userView, position: Int) {
        val curr_user:user = arraylist[position]
        holder.name.text = curr_user.Name
        holder.descrption.text = curr_user.Description
        holder.path.text = curr_user.Path
    }
}