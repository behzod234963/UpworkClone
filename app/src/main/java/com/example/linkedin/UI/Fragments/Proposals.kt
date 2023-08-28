package com.example.linkedin.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.linkedin.R
import com.example.linkedin.UI.Adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class Proposals : Fragment() {

    lateinit var vplist:ArrayList<Fragment>
    lateinit var titlelist:ArrayList<String>
    private lateinit var vpAdapter:ViewPagerAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_proposals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initView(view)

    }

    private fun initView(view: View) {

       loadlist()

        val vpViewPager: ViewPager = view.findViewById(R.id.vpViewPager)
        val tlTab: TabLayout = view.findViewById(R.id.tlTab)
        tlTab.setupWithViewPager(vpViewPager)
        vpAdapter= fragmentManager?.let { ViewPagerAdapter(vplist,titlelist, it) }!!
        vpViewPager.adapter=vpAdapter

    }

    private fun loadlist() {
        vplist= ArrayList()
        titlelist= ArrayList()

        titlelist.add("Active")
        vplist.add(ActiveProposals())
        titlelist.add("Referrals")
        vplist.add(ReferralsProposals())
        titlelist.add("Archived")
        vplist.add(ArchivedProposals())

    }

}