package com.example.linkedin.UI.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.linkedin.R
import com.example.linkedin.UI.Model.JobsVerModel

class JobsAdapter(val ctx:Context, val verList: ArrayList<JobsVerModel>):RecyclerView.Adapter<ViewHolder>() {

    val ITEM_VER=0
    val ITEM_HOZ=1

    class JobsVerViewHolder(view: View):RecyclerView.ViewHolder(view){

        val tvTitleVer:TextView=view.findViewById(R.id.tv_Title_jobsVer)
        val tvHistoryVer:TextView=view.findViewById(R.id.tv_history_jobsVer)
        val tvBudgetVer:TextView=view.findViewById(R.id.tv_Budget_jobsVer)
        val tvCommentVer:TextView=view.findViewById(R.id.tv_Comment_jobsVer)
        val ivPayImageVer:ImageView=view.findViewById(R.id.iv_PaymentImage_jobsVer)
        val tvPayStatusVer:TextView=view.findViewById(R.id.tv_PaymentText_jobsVer)
        val tvCostVer:TextView=view.findViewById(R.id.tv_PaymentCost_jobsVer)

    }

    class JobsHozViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val rvJobsHoz:RecyclerView?=view.findViewById(R.id.rvJobs_Hoz)

    }

    override fun getItemViewType(position: Int): Int {

        return if (!verList[position].hozContent.isNullOrEmpty()) ITEM_HOZ else ITEM_VER

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view:View

        return if (viewType==ITEM_HOZ){

            view=LayoutInflater.from(parent.context).inflate(R.layout.item_jobs_hozcontent,parent,false)
            JobsHozViewHolder(view)

        }else{

            view=LayoutInflater.from(parent.context).inflate(R.layout.item_jobs_vercontent,parent,false)
            JobsVerViewHolder(view)

        }

    }

    override fun getItemCount(): Int {

        return verList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val l=verList[position]

        if (holder is JobsHozViewHolder){

            holder.apply {

                rvJobsHoz?.layoutManager=LinearLayoutManager(ctx,LinearLayoutManager.HORIZONTAL,false)

            }

        }

        if (holder is JobsVerViewHolder){

            holder.apply {

                tvTitleVer.text=l.title
                tvHistoryVer.text=l.history
                tvBudgetVer.text=l.budget
                tvCommentVer.text=l.comment
                ivPayImageVer.setImageResource(l.payImage)
                tvPayStatusVer.text=l.payText
                tvCostVer.text=l.payCost

            }

        }

    }

}