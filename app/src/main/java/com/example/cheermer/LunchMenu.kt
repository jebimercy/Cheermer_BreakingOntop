package com.example.cheermer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LunchMenu : AppCompatActivity() {

    private lateinit var book:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunch_menu)

        book = findViewById(R.id.btnnbook)

        book.setOnClickListener {

            var gotomain = Intent(this, MainActivity::class.java)
            startActivity(gotomain)
        }

    }
}