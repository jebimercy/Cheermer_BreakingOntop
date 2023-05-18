package com.example.cheermer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BreakfastMenu : AppCompatActivity() {

    private lateinit var book:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast_menu)

        book = findViewById(R.id.btnbreak)

        book.setOnClickListener {

            var gotomain = Intent(this, MainActivity::class.java)
            startActivity(gotomain)
        }

    }
}