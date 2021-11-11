package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.activities.MainActivity
import com.example.fitapp.databinding.ActivityCongrationBinding


class Congration : AppCompatActivity() {
    lateinit var binding : ActivityCongrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCongrationBinding.inflate(layoutInflater)
        setContentView(binding.root)


            binding.btnlogin2.setOnClickListener {
                val intent = Intent(this, Signin ::class.java)
                startActivity(intent)
            }
        }
    }
