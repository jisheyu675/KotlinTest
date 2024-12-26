package com.example.testkotlinapplication.liquidswipedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testkotlinapplication.R
import com.jem.liquidswipe.LiquidSwipeViewPager

class LiquidsWipeDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liquids_wipe_demo)
        var viewpager = findViewById<LiquidSwipeViewPager>(R.id.viewpagerDemo);

        viewpager.adapter = CustomFragmentPagerAdapter(supportFragmentManager)
        viewpager.setCurrentItem(titleArray.count() * 10, false)
    }
}