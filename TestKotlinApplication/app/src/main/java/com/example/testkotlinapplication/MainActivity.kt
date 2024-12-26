package com.example.testkotlinapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testkotlinapplication.bookkeeping.UserCenterActivity
import com.example.testkotlinapplication.liquidswipedemo.LiquidsWipeDemo
import com.example.testkotlinapplication.pagertest.ViewPagerTestActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun liquidsSwipe(view : View){
        startActivity(Intent(this, LiquidsWipeDemo::class.java))
    }

    fun accountingTest(view : View){
        startActivity(Intent(this, AccountingActivity::class.java))
    }



}