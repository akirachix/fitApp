package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitapp.R
import com.example.fitapp.Signup
import com.example.fitapp.databinding.ActivityGoalsBinding

class Goals : AppCompatActivity() {
    lateinit var binding: ActivityGoalsBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        val binding: ActivityGoalsBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_goals
        )
        // click listener for layout

        binding.btnsave.setOnClickListener {
            val intent = Intent(this,ProgressActivity::class.java)
            startActivity(intent)
        }



    }
}