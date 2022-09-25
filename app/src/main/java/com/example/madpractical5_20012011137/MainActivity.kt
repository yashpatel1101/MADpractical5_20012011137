package com.example.madpractical5_20012011137

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var playbtn : FloatingActionButton
    private lateinit var stopbtn : FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playbtn = findViewById(R.id.btn_play)
        playbtn.setOnClickListener(View.OnClickListener {
            play()
        })

        stopbtn = findViewById(R.id.btn_stop)
        stopbtn.setOnClickListener(View.OnClickListener {
            stop()
        })
    }

    fun play() {
        Intent(applicationContext, MyService::class.java).putExtra(
            MyService.DATA_KEY,
            MyService.DATA_VALUE
        ).apply { startService(this) }
    }

    fun stop() {
        Intent(applicationContext, MyService::class.java).apply { stopService(this) }
    }
}