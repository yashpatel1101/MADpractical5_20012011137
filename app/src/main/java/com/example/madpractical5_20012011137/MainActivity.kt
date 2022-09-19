package com.example.madpractical5_20012011137

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun play(view: View) {
        Intent(applicationContext, MyService::class.java).apply {
            stopService(this)
        }
        fun stop(view: View) {
            Intent(applicationContext, MyService::class.java).putExtra(
                MyService.DATA_KEY,
                MyService.DATA_VALUE
            ).apply {
                startService(this)
            }
        }
    }
}