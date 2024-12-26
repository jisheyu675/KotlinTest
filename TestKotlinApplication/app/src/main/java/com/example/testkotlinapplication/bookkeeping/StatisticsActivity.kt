package com.example.testkotlinapplication.bookkeeping

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testkotlinapplication.R
import com.example.testkotlinapplication.pagertest.ScreenSlidePagerAdapter
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.jem.liquidswipe.LiquidSwipeViewPager


class StatisticsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        var viewpager = findViewById<LiquidSwipeViewPager>(R.id.staticviewpager);
//        enableEdgeToEdge()
        viewpager.adapter = ScreenSlidePagerAdapter(supportFragmentManager)



    }
}