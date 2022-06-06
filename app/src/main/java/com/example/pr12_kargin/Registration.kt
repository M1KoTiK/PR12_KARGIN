package com.example.pr12_kargin

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Registration : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btnCreateaAcc = findViewById<TextView>(R.id.btnCreateAcc)
        btnCreateaAcc.setOnClickListener{
            val openReg_acc = Intent(this, reg_new_acc::class.java)
            startActivity(openReg_acc)
        }
    }
}