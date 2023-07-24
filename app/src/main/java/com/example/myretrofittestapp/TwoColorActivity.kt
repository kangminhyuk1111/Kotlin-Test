package com.example.myretrofittestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myretrofittestapp.databinding.ActivityMainBinding
import com.example.myretrofittestapp.databinding.ActivityTwoColorBinding

class TwoColorActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTwoColorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoColorBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setButtons() {
        val buttonRed = binding.redFragment
        val buttonBlue = binding.blueFragment

        buttonRed.setOnClickListener{
            val fragmentTransaction = supportFragmentManager.beginTransaction()
        }
        buttonBlue.setOnClickListener{

        }
    }
}