package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitapp.activities.MainActivity
import com.example.fitapp.databinding.ActivityCongrationBinding

class Congration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_congration)

            val binding: ActivityCongrationBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_congration)

            binding.btnlogin2.setOnClickListener {
                val intent = Intent(this, Signin ::class.java)
                startActivity(intent)
            }
        }
    }
