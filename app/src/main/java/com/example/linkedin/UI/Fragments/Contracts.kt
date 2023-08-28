package com.example.linkedin.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedin.R
import com.example.linkedin.UI.Adapter.ContractsAdapter
import com.example.linkedin.UI.Model.ContractsModel

class Contracts : Fragment() {

    lateinit var list:ArrayList<ContractsModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contracts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initView(view)

    }

    private fun initView(view: View) {

        loadlist()
        val rvContracts:RecyclerView=view.findViewById(R.id.rvContracts)
        rvContracts.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        rvContracts.adapter=ContractsAdapter(list,requireContext())

    }

    private fun loadlist() {

        list=ArrayList()

        list.add(ContractsModel("Active Contracts","Contracts you're activitely working on will appear here.","Start searching for new projects now."))
        list.add(ContractsModel("Direct Contracts","Create simple contracts with non-Upwork clients,\nprotected in escrow,leading to quick payment.","Create and view your Direct Contracts."))

    }

}