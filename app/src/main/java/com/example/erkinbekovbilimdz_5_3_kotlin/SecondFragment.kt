package com.example.erkinbekovbilimdz_5_3_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.erkinbekovbilimdz_5_3_kotlin.databinding.FragmentFirstBinding
import com.example.erkinbekovbilimdz_5_3_kotlin.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        receiving()
    }

    private fun receiving() {
        if (arguments != null) {
            val number = arguments?.getString("KEY_FOR_ZERO")
            binding.tvResult.text = number
        }
    }
}