package com.example.project_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class TabLayout : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var tabItem: TabItem
    lateinit var tabItem1: TabItem
    lateinit var tabItem2: TabItem
    lateinit var tabItem3: TabItem
    lateinit var tabItem4: TabItem
    lateinit var viewPager : ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)
        tabLayout = findViewById(R.id.tablayout)
        tabItem = findViewById(R.id.first)
        tabItem1 = findViewById(R.id.second)
        tabItem2 = findViewById(R.id.third)
        tabItem3 = findViewById(R.id.founth)
        tabItem4 = findViewById(R.id.five)
        viewPager = findViewById(R.id.viewPager)
        val fragmentAdapter = FragmentAdapter(this,supportFragmentManager,5)
        viewPager.adapter = fragmentAdapter

        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
                if (tab.position == 0 || tab.position == 1 || tab.position == 2 || tab.position == 3 || tab.position == 4){
                        fragmentAdapter.notifyDataSetChanged()
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

    }
}