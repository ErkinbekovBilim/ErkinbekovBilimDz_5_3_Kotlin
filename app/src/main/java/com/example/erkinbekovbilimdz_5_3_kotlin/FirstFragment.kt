package com.example.erkinbekovbilimdz_5_3_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.erkinbekovbilimdz_5_3_kotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        plusAndMinus()
        btnSend()
    }


    private fun plusAndMinus() {
        binding.btnPlusMinus.setOnClickListener {
            if (binding.btnPlusMinus.text.equals("+1")) {
                count++
                binding.tvZero.text = count.toString()
            }
            if (binding.tvZero.text.equals("11")) {
                binding.btnPlusMinus.text = "-1"
            }
            if (binding.btnPlusMinus.text.equals("-1")) {
                count--
                binding.tvZero.text = count.toString()
            }
            if (binding.btnPlusMinus.text.equals("-1") && binding.tvZero.text.equals("0")) {
                binding.btnSend.visibility = View.VISIBLE
            }
            if (binding.tvZero.text.equals("-1")){
                binding.btnSend.visibility = View.GONE
            }
        }
    }

    private fun btnSend() {
        binding.btnSend.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("KEY_FOR_ZERO",binding.tvZero.text.toString())
                val  secondFragment = SecondFragment()
                secondFragment.arguments = bundle
                requireActivity().supportFragmentManager
                    .beginTransaction().replace(R.id.fragment_one,secondFragment).addToBackStack(null).commit()
        }
    }
}