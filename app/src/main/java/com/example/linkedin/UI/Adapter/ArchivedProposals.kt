package com.example.linkedin.UI.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedin.R
import com.example.linkedin.UI.Model.ActiveModel
import com.example.linkedin.UI.Model.ArchivedModel

class ArchiveAdapter(val list: ArrayList<ArchivedModel>, requireContext: Context): RecyclerView.Adapter<ArchiveAdapter.ArchiveViewHolder>() {

    class ArchiveViewHolder(view: View): RecyclerView.ViewHolder(view){

        val tvText: TextView =view.findViewById(R.id.tvText_active)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArchiveViewHolder {

        return ArchiveViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_archive,parent,false))

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: ArchiveViewHolder, position: Int) {

        holder.tvText.text=list[position].text

    }
}