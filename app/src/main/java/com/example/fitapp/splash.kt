package com.example.fitapp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.databinding.ActivitySplashBinding

class splash : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnget.setOnClickListener {
            var intent = Intent(baseContext, Slides::class.java)
            startActivity(intent)
        }
    }
}
