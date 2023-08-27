package com.example.linkedin.UI.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedin.R
import com.example.linkedin.UI.Model.JobsHozModel

class JobsHozAdapter(val hozList:ArrayList<JobsHozModel>):RecyclerView.Adapter<JobsHozAdapter.HozViewHolder>() {

    class HozViewHolder(view: View):RecyclerView.ViewHolder(view){

        val tvTitleHoz:TextView=view.findViewById(R.id.tv_Title_jobsHoz)
        val tvTextHoz:TextView=view.findViewById(R.id.tv_Text_jobsHoz)
        val ivImageHoz:ImageView=view.findViewById(R.id.iv_Image_ItemHoz)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HozViewHolder {

        return HozViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_jobs_hozcontent,parent,false))

    }

    override fun getItemCount(): Int {

        return hozList.size

    }

    override fun onBindViewHolder(holder: HozViewHolder, position: Int) {

        val l=hozList[position]

        holder.apply {

            tvTitleHoz.text=l.title
            tvTextHoz.text=l.text
            ivImageHoz.setImageResource(l.image)

        }

    }

}