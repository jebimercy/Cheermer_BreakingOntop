package com.example.cheermer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RoomsActivity : AppCompatActivity() {

    private lateinit var btnbook:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rooms)

        btnbook = findViewById(R.id.book)

        btnbook.setOnClickListener {

            var gotomain = Intent(this, MainActivity::class.java)
            startActivity(gotomain)
        }

    }
}