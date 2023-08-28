package com.example.linkedin.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedin.R
import com.example.linkedin.UI.Adapter.ArchiveAdapter
import com.example.linkedin.UI.Model.ArchivedModel

class ArchivedProposals : Fragment() {

    lateinit var list:ArrayList<ArchivedModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_archived_proposals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initView(view)

    }

    private fun initView(view: View) {

        loadList()
        val rvArchive:RecyclerView=view.findViewById(R.id.rvArchive)
        rvArchive.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        rvArchive.adapter=ArchiveAdapter(list,requireContext())

    }

    private fun loadList() {

        list=ArrayList()

        list.add(ArchivedModel("Archived proposals (0)"))
        list.add(ArchivedModel("Archived interviews (0)"))

    }

}