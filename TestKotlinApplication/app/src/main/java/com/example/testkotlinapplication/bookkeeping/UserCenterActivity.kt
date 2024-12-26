package com.example.testkotlinapplication.bookkeeping

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testkotlinapplication.AccountingActivity
import com.example.testkotlinapplication.MainActivity
import com.example.testkotlinapplication.R


class UserCenterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_center)


        val shouZhiGuanLi = findViewById<LinearLayout>(R.id.shouzhiguanli)
        shouZhiGuanLi.setOnClickListener{
            startActivity(Intent(this, ManageActivity::class.java))
        }


        val chaKanShouZhi = findViewById<LinearLayout>(R.id.chakanshouzhi)
        chaKanShouZhi.setOnClickListener{
            startActivity(Intent(this, SearchRecordActivity::class.java))
        }

        val logout = findViewById<LinearLayout>(R.id.logout)
        logout.setOnClickListener{
            startActivity(Intent(this, AccountingActivity::class.java))
        }

        val shouZhiTonJi = findViewById<LinearLayout>(R.id.shouzhitonji)
        shouZhiTonJi.setOnClickListener{
            startActivity(Intent(this, StatisticsActivity::class.java))
        }


    }
}