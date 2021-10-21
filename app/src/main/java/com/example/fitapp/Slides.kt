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

        binding = ActivitySlidesBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnget.setOnClickListener {
//            var intent = Intent(baseContext, splash ::class.java)
//            startActivity(intent)
//        }

        binding.btnlogin.setOnClickListener {
            var intent = Intent(baseContext, Signin ::class.java)
            startActivity(intent)
        }
        binding.btnaccount.setOnClickListener {
            var intent = Intent(baseContext, Signup ::class.java)
            startActivity(intent)
        }


    }
}