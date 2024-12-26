package com.example.testkotlinapplication.pagertest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testkotlinapplication.R
import com.example.testkotlinapplication.bookkeeping.StatisPagerAdapter
import com.jem.liquidswipe.LiquidSwipeViewPager
import com.jem.liquidswipe.base.LiquidSwipeLayout
import com.jem.liquidswipe.clippathprovider.LiquidSwipeClipPathProvider

class ViewPagerTestActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_test)
        var viewpager = findViewById<LiquidSwipeViewPager>(R.id.viewpagerTest);

//        enableEdgeToEdge()



        // Create an array of LiquidSwipeCPP, one for each layout in the PagerAdapter
        val liquidSwipeClipPathProviders = Array(3) {
            LiquidSwipeClipPathProvider()
        }
        viewpager.adapter = ScreenSlidePagerAdapter(supportFragmentManager)
// Similar logic can also be applied for your custom FragmentPagerAdapter/FragmentStatePagerAdapter

// Listen to onTouch events on the viewpager and update the waveCenterY value of the LiquidSwipeCPPs
        viewpager.setOnTouchListener { _, event ->
            val waveCenterY = event.y
            liquidSwipeClipPathProviders.map {
                it.waveCenterY = waveCenterY
            }
            false
        }

    }




}
