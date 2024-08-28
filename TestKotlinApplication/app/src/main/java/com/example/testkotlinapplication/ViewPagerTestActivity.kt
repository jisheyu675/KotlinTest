package com.example.testkotlinapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jem.liquidswipe.LiquidSwipeViewPager

class ViewPagerTestActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_test)
        var viewpager = findViewById<LiquidSwipeViewPager>(R.id.viewpager);

//        enableEdgeToEdge()
        viewpager.adapter = ScreenSlidePagerAdapter(supportFragmentManager)
    }
}