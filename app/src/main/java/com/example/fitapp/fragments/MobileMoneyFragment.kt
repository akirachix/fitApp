package com.example.fitapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitapp.R
import com.example.fitapp.activities.Congrates2
import com.example.fitapp.activities.InstractorScreen
import com.example.fitapp.databinding.FragmentMobileMoneyBinding

class MobileMoneyFragment : Fragment() {

        private var _binding:FragmentMobileMoneyBinding? = null

        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?

        ): View? {
            _binding = FragmentMobileMoneyBinding.inflate(inflater, container, false)

            binding.btnMpesa.setOnClickListener {
                val intent = Intent(context, MpessaFragment::class.java)
                startActivity(intent)
            }

            binding.btnCard.setOnClickListener {
                val intent = Intent(context, CardFragment::class.java)
                startActivity(intent)
            }
            binding.btnAirtel.setOnClickListener {
                val intent = Intent(context, AirtelMonneyFragment::class.java)
                startActivity(intent)
            }
            binding.btnMobile.setOnClickListener {
                val intent = Intent(context, MobileMoneyFragment::class.java)
                startActivity(intent)
            }
            binding.btnComplete.setOnClickListener {
                val intent = Intent(context, Congrates2::class.java)
                startActivity(intent)
            }
            binding.tvCancel.setOnClickListener {
                val intent = Intent(context, InstractorScreen::class.java)
                startActivity(intent)
            }

            return binding.root
        }

    }
