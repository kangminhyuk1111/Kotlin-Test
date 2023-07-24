package com.example.myretrofittestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myretrofittestapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        settingButton()
    }
    fun settingButton() {
        binding.button.setOnClickListener{
            val intent = Intent(this,TwoColorActivity::class.java)
            startActivity(intent)
        }
    }
}