package com.example.linkedin.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedin.R
import com.example.linkedin.UI.Adapter.ActiveAdapter
import com.example.linkedin.UI.Model.ActiveModel

class ActiveProposals : Fragment() {

    private lateinit var list:ArrayList<ActiveModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_active_proposals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initView(view)

    }

    private fun initView(view: View) {

        loadList()
        val rvActice:RecyclerView=view.findViewById(R.id.rvActive)
        rvActice.adapter=ActiveAdapter(list,requireContext())
        rvActice.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)

    }

    private fun loadList() {

        list=ArrayList()

        list.add(ActiveModel("Offers (0)"))
        list.add(ActiveModel("Invitations to interview (0)"))
        list.add(ActiveModel("Active proposals (0)"))
        list.add(ActiveModel("Submitted proposals (0)"))

    }

}