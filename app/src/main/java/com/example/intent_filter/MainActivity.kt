package com.example.intent_filter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intent_filter.SecondActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create an Intent to start SecondActivity
        val intent = Intent(this, SecondActivity::class.java)

        // Start SecondActivity using the intent
        startActivity(intent)
    }
}
