package com.example.project_demo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class FragmentAdapter : FragmentPagerAdapter(object : FragmentManager() {}) {
    var tabCount = 0

    override fun getCount(): Int {
        return tabCount
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return First()
            1 -> return Second()
            2 -> return Three()
            3 -> return Four()
            4 -> return Five()
            else -> First()
        }
        return First()
    }

}