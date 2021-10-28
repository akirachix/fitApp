package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.SplashScreen
import androidx.databinding.DataBindingUtil
import com.example.fitapp.R
import com.example.fitapp.databinding.ActivityGoalsBinding

class ProgressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        val binding: ActivityGoalsBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_goals
        )
        // click listener for layout

        binding.btnsave.setOnClickListener {
            val intent = Intent(this, splash::class.java)
            startActivity(intent)
        }



    }


}