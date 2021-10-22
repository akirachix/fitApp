package com.example.fitapp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitapp.databinding.ActivitySplashBinding

class splash : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(
            this, R.layout.activity_splash )
        // click listener for layout
        binding.layoutSplash.setOnClickListener {
            val intent = Intent(this, Slides::class.java)
            startActivity(intent)
        }

    }
}
