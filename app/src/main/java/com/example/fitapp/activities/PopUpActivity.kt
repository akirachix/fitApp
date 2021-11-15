package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.R
import com.example.fitapp.databinding.ActivityPopUpBinding
import com.example.fitapp.databinding.ActivitySlidesBinding

class PopUpActivity : AppCompatActivity() {
    lateinit var binding:ActivityPopUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPopUpBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnPopup.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }
        binding.btnPopup2.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }
        binding.btnPopup3.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}


