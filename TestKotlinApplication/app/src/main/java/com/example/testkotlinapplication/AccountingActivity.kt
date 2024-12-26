package com.example.testkotlinapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.testkotlinapplication.bookkeeping.UserCenterActivity
import com.example.testkotlinapplication.liquidswipedemo.LiquidsWipeDemo

class AccountingActivity : AppCompatActivity() {
    private var edt_id: EditText? = null
    private var edt_pwd: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accounting)

        edt_id = findViewById(R.id.edt_uid);
        edt_pwd =findViewById(R.id.edt_upwd);

        val userId = edt_id?.text.toString()
        val userPwd = edt_pwd?.text.toString()

        var btn_login: Button = findViewById(R.id.btn_login)
        btn_login.setOnClickListener{
            Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
            startActivity(Intent(this, UserCenterActivity::class.java))
        }
    }
}