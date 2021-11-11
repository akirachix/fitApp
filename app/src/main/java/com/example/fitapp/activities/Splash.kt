package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.R
import com.example.fitapp.Slides
import com.example.fitapp.databinding.ActivitySplashBinding

class splash : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // click listener for layout
        binding.layoutSplash.setOnClickListener {
            val intent = Intent(this, Slides::class.java)
            startActivity(intent)
        }

    }
}
