package com.example.cheermer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var IVnote:ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        IVnote = findViewById(R.id.ivnote)

        IVnote.alpha = 0f
        IVnote.animate().setDuration(2000).alpha(1f).withEndAction {
            var i = Intent(this, LoginActivity::class.java)
            startActivity(i)

            finish()

        }


    }
}