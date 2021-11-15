package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.fitapp.R
import com.example.fitapp.Slides
import com.example.fitapp.databinding.ActivitySplashBinding

class splash : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash)
            supportActionBar?.hide()
            Handler().postDelayed({
                val intent=Intent(this@splash, Slides::class.java)
                startActivity(intent)
                finish()
            },3000)
        }
    }
