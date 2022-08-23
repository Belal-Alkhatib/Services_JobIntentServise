package com.example.and2_nluc5_par1_jobintentservise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            val i = Intent(this,MyIntentService::class.java)
            i.putExtra("msg",txtMasg.text.toString())
            MyIntentService.enqueuWork(this,i)
        }


    }
}