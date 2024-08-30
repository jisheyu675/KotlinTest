package com.example.testkotlinapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.viewpager.widget.ViewPager
import com.example.testkotlinapplication.login.LoginAdapter
import com.example.testkotlinapplication.login.LoginDialogFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewpager_login = findViewById<ViewPager>(R.id.viewpager_login)
        //viewpager_login与适配器关联
        viewpager_login.adapter= LoginAdapter(supportFragmentManager)


        var table_layout = findViewById<TabLayout>(R.id.table_layout)
        //将table_layout与viewPager_login关联
        table_layout.setupWithViewPager(viewpager_login)

        //table_layout与viewPager_login关联后 文字的添加  数量大是采用数组
        table_layout.getTabAt(0)?.text="Login"
        table_layout.getTabAt(1)?.text="Sign up"




    }



}