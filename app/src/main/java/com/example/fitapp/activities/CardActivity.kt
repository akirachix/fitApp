package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.databinding.ActivityCardBinding

class CardActivity : AppCompatActivity() {

            lateinit var binding: ActivityCardBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityCardBinding.inflate(layoutInflater)
                setContentView(binding.root)

                onClick()
            }
            fun onClick() {
                binding.btnCard.setOnClickListener {
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)

                }
                binding.btnMpesa.setOnClickListener {
                    val intent = Intent(baseContext, MpessaActivity::class.java)
                    startActivity(intent)
                }

                binding.btnAirtel.setOnClickListener {
                    val intent = Intent(baseContext, AirtelMoneyActivity::class.java)
                    startActivity(intent)
                }

                binding.btnMobile.setOnClickListener {
                    val intent = Intent(baseContext, MobileMoneyActivity::class.java)
                    startActivity(intent)
                }
                binding.btnComplete.setOnClickListener {
                    val intent = Intent(baseContext,Congrates2::class.java)
                    startActivity(intent)
                }
                binding.tvCancel.setOnClickListener {
                    val intent = Intent(baseContext,InstractorScreen::class.java)
                    startActivity(intent)
                }

            }
        }


