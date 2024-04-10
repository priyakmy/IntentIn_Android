package com.example.intent_filter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickbutton = findViewById<Button>(R.id.btnNext)

            clickbutton.setOnClickListener{
            // Create an Intent to start SecondActivity
            val intent = Intent(this , SecondActivity::class.java)

            // Start SecondActivity using the intent
            startActivity(intent)
                finish()
        }
    }
}
