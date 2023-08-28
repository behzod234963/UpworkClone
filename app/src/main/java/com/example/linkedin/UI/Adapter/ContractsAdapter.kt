package com.example.linkedin.UI.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedin.R
import com.example.linkedin.UI.Model.ContractsModel

class ContractsAdapter(val list: ArrayList<ContractsModel>, requireContext: Context):RecyclerView.Adapter<ContractsAdapter.ContractsViewHolder>() {

    class ContractsViewHolder(view: View):RecyclerView.ViewHolder(view){

        val tvTitle:TextView=view.findViewById(R.id.tvAvailableTitle)
        val tvText:TextView=view.findViewById(R.id.tvAvailableText)
        val tvLink:TextView=view.findViewById(R.id.tvAvailableLink)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContractsViewHolder {

        return ContractsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_contracts,parent,false))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ContractsViewHolder, position: Int) {

        val l=list[position]

        holder.apply {

            tvTitle.text=l.title
            tvText.text=l.text
            tvLink.text=l.link

        }

    }
}