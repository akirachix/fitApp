package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.databinding.ActivitySlidesBinding
import com.example.fitapp.databinding.ActivitySplashBinding

class Slides : AppCompatActivity() {

    lateinit var binding: ActivitySlidesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(
            this, R.layout.activity_Slides )
        // click listener for layout
        binding.layoutSlides.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

    }
}