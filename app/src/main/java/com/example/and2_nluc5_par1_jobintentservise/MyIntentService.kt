package com.example.and2_nluc5_par1_jobintentservise

import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class MyIntentService : JobIntentService() {

    companion object{
        fun enqueuWork(context:Context,work:Intent){
            enqueueWork(context,MyIntentService::class.java,123,work)
        }
    }

    override fun onCreate() {
        super.onCreate()
        Log.e("hzm","On Create")
    }
    override fun onHandleWork(intent: Intent) {
        Log.e("hzm","onHandleWork")
        Log.e("hzm",Thread.currentThread().name)

        val msg = intent.getStringExtra("msg")

        for(i in 0..9){
            Log.e("hzm", "i = $i , $msg")
            Thread.sleep(1000)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("hzm","On Destroy")

    }
}