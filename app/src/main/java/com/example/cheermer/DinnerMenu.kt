package com.example.cheermer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DinnerMenu : AppCompatActivity() {

    private lateinit var book:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner_menu)

        book = findViewById(R.id.btnbookk)

        book.setOnClickListener {

            var gotomain = Intent(this, MainActivity::class.java)
            startActivity(gotomain)
        }

    }
}