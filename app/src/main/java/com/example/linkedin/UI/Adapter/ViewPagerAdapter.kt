package com.example.linkedin.UI.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(private val frlist:ArrayList<Fragment>, private val title:ArrayList<String>, fr:FragmentManager):FragmentPagerAdapter(fr) {
    override fun getCount(): Int {

        return frlist.size

    }

    override fun getItem(position: Int): Fragment {

        return frlist[position]

    }

    override fun getPageTitle(position: Int): CharSequence? {

        return title[position]

    }

}