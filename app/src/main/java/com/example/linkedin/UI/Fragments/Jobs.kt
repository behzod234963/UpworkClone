package com.example.linkedin.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedin.R
import com.example.linkedin.UI.Adapter.JobsAdapter
import com.example.linkedin.UI.Model.JobsHozModel
import com.example.linkedin.UI.Model.JobsVerModel

class Jobs : Fragment() {

    private lateinit var verlist:ArrayList<JobsVerModel>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jobs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initView(view)

    }

    private fun initView(view: View) {

        loadList()
        val rvJobsVer:RecyclerView=view.findViewById(R.id.rvJobsVer)
        val adapter=JobsAdapter(requireContext(),verlist)
        rvJobsVer.adapter=adapter
        rvJobsVer.layoutManager=LinearLayoutManager(requireContext())

    }

    private fun loadList() {

        verlist= ArrayList()
        val hozlist:ArrayList<JobsHozModel> = ArrayList()

        hozlist.add(JobsHozModel("Get tips to find work","Learn how to optimize,\nuse Connects,and more to\nland your first job",R.drawable.pic_item_hoz))
        hozlist.add(JobsHozModel("My proposals","Review your proposals,offers,refferals,and client invitations.",R.drawable.pic_image_item_hoz))
        hozlist.add(JobsHozModel("Get tips to find work","Learn how to optimize,\nuse Connects,and more to\nland your first job",R.drawable.pic_item_hoz))
        hozlist.add(JobsHozModel("My proposals","Review your proposals,offers,refferals,and client invitations.",R.drawable.pic_image_item_hoz))
        hozlist.add(JobsHozModel("Get tips to find work","Learn how to optimize,\nuse Connects,and more to\nland your first job",R.drawable.pic_item_hoz))
        hozlist.add(JobsHozModel("My proposals","Review your proposals,offers,refferals,and client invitations.",R.drawable.pic_image_item_hoz))
        hozlist.add(JobsHozModel("Get tips to find work","Learn how to optimize,\nuse Connects,and more to\nland your first job",R.drawable.pic_item_hoz))
        hozlist.add(JobsHozModel("My proposals","Review your proposals,offers,refferals,and client invitations.",R.drawable.pic_image_item_hoz))
        hozlist.add(JobsHozModel("Get tips to find work","Learn how to optimize,\nuse Connects,and more to\nland your first job",R.drawable.pic_item_hoz))
        hozlist.add(JobsHozModel("My proposals","Review your proposals,offers,refferals,and client invitations.",R.drawable.pic_image_item_hoz))

        verlist.add(
            JobsVerModel(hozlist,"Android Application publishing(if you have Play console",
                "Fixed-price-Posted 3hr.ago",
                "$14",
                "Hello Need Publish android applicationson Google play console account who have a google play console",
                R.drawable.pic_unverified_item_ver,
                "Payment unverfied",
                "$0"))
        verlist.add(
            JobsVerModel(null,"We need someone who have GP console account",
                "Fixed-price-Posted 7hr.ago",
                "$25",
                "Hello Need an Publisher for publishing my android App on Google Play.I have Ready-made",
                R.drawable.pic_verified_item_ver,
                "Payment verfied",
                "$30"))
        verlist.add(
            JobsVerModel(null,"Need freelancer for host Android application",
                "Fixed-price-Posted 4hr.ago",
                "$35",
                "Hello we need who publish application on Google play",
                R.drawable.pic_verified_item_ver,
                "Payment verified",
                "$67"))
        verlist.add(
            JobsVerModel(null,"Android Application publishing(if you have Play console",
                "Fixed-price-Posted 3hr.ago",
                "$14",
                "Hello Need Publish android applicationson Google play console account who have a google play console",
                R.drawable.pic_unverified_item_ver,
                "Payment unverfied",
                "$0"))
        verlist.add(
            JobsVerModel(null,"We need someone who have GP console account",
                "Fixed-price-Posted 7hr.ago",
                "$25",
                "Hello Need an Publisher for publishing my android App on Google Play.I have Ready-made",
                R.drawable.pic_verified_item_ver,
                "Payment verfied",
                "$30"))
        verlist.add(
            JobsVerModel(null,"Need freelancer for host Android application",
                "Fixed-price-Posted 4hr.ago",
                "$35",
                "Hello we need who publish application on Google play",
                R.drawable.pic_verified_item_ver,
                "Payment verified",
                "$67"))
        verlist.add(
            JobsVerModel(null,"Android Application publishing(if you have Play console",
                "Fixed-price-Posted 3hr.ago",
                "$14",
                "Hello Need Publish android applicationson Google play console account who have a google play console",
                R.drawable.pic_unverified_item_ver,
                "Payment unverfied",
                "$0"))
        verlist.add(
            JobsVerModel(null,"We need someone who have GP console account",
                "Fixed-price-Posted 7hr.ago",
                "$25",
                "Hello Need an Publisher for publishing my android App on Google Play.I have Ready-made",
                R.drawable.pic_verified_item_ver,
                "Payment verfied",
                "$30"))
        verlist.add(
            JobsVerModel(null,"Need freelancer for host Android application",
                "Fixed-price-Posted 4hr.ago",
                "$35",
                "Hello we need who publish application on Google play",
                R.drawable.pic_verified_item_ver,
                "Payment verified",
                "$67"))
        verlist.add(
            JobsVerModel(null,"Android Application publishing(if you have Play console",
                "Fixed-price-Posted 3hr.ago",
                "$14",
                "Hello Need Publish android applicationson Google play console account who have a google play console",
                R.drawable.pic_unverified_item_ver,
                "Payment unverfied",
                "$0"))
        verlist.add(
            JobsVerModel(null,"We need someone who have GP console account",
                "Fixed-price-Posted 7hr.ago",
                "$25",
                "Hello Need an Publisher for publishing my android App on Google Play.I have Ready-made",
                R.drawable.pic_verified_item_ver,
                "Payment verfied",
                "$30"))
        verlist.add(
            JobsVerModel(null,"Need freelancer for host Android application",
                "Fixed-price-Posted 4hr.ago",
                "$35",
                "Hello we need who publish application on Google play",
                R.drawable.pic_verified_item_ver,
                "Payment verified",
                "$67"))

    }

}