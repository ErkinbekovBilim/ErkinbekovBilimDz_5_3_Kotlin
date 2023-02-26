package com.example.erkinbekovbilimdz_5_3_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.erkinbekovbilimdz_5_3_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_one, FirstFragment()).commit()
        }
    }
}