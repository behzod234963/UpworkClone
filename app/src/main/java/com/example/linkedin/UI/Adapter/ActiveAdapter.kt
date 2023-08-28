package com.example.linkedin.UI.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedin.R
import com.example.linkedin.UI.Model.ActiveModel

class ActiveAdapter(val list: ArrayList<ActiveModel>, requireContext: Context):RecyclerView.Adapter<ActiveAdapter.ActiveViewHolder>() {

    class ActiveViewHolder(view: View):RecyclerView.ViewHolder(view){

        val tvText:TextView=view.findViewById(R.id.tvText_active)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActiveViewHolder {

        return ActiveViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_active,parent,false))

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: ActiveViewHolder, position: Int) {

        val l=list[position]

        holder.tvText.text=l.text

    }

}