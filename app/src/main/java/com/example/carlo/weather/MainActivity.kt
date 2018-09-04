package com.example.carlo.weather

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var forecastButton = findViewById<Button>(R.id.forecastButton)

        forecastButton.setOnClickListener {
            var searchEditText = findViewById<EditText>(R.id.searchEditText)
            if (searchEditText.text.toString().trim().isNotEmpty()) {
                var forecastIntent = Intent(applicationContext,ForecastActivity::class.java)
                forecastIntent.putExtra("searchTerm",searchEditText.text.toString())
                startActivity(forecastIntent)
            }
        }

    }
}
