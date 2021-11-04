
package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitapp.R
import com.example.fitapp.Signin
import com.example.fitapp.Signup
import com.example.fitapp.databinding.ActivityPopUpBinding
import com.example.fitapp.databinding.ActivitySlidesBinding

class PopUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up)

        val binding: ActivityPopUpBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_pop_up
        )
        binding.btnPopup.setOnClickListener {
            val intent = Intent(this, Card::class.java)
            startActivity(intent)
        }
        binding.btnPopup2.setOnClickListener {
            val intent = Intent(this, Card::class.java)
            startActivity(intent)

        }
        binding.btnPopup3.setOnClickListener {
            val intent = Intent(this, Card::class.java)
            startActivity(intent)
        }
    }
}