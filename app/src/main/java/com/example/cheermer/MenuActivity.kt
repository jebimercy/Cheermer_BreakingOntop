package com.example.cheermer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MenuActivity : AppCompatActivity() {

    private lateinit var breakfast:TextView
    private lateinit var lunch:TextView
    private lateinit var dinner:TextView
    private lateinit var room:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        breakfast = findViewById(R.id.txtbreak)
        lunch = findViewById(R.id.txtlunch)
        dinner = findViewById(R.id.txtdinner)
        room = findViewById(R.id.bookroom)

        breakfast.setOnClickListener {

            var gotobreak = Intent(this, BreakfastMenu::class.java)
            startActivity(gotobreak)

        }
        lunch.setOnClickListener {

            var gotolunch = Intent(this, LunchMenu::class.java)
            startActivity(gotolunch)

        }
        dinner.setOnClickListener {

            var gotodinner = Intent(this, DinnerMenu::class.java)
            startActivity(gotodinner)

        }
        room.setOnClickListener {

            var gotorooms = Intent(this, RoomsActivity::class.java)
            startActivity(gotorooms)

        }

    }
}