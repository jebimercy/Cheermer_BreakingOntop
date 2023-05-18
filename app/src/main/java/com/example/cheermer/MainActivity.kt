package com.example.cheermer

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {

    private lateinit var Myuser:EditText
    private lateinit var Mydishroom:EditText
    private lateinit var Mytime:EditText
    private lateinit var Mybook:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Myuser = findViewById(R.id.edtuser)
        Mydishroom = findViewById(R.id.edtdishroom)
        Mytime = findViewById(R.id.edttime)
        Mybook = findViewById(R.id.btnbook)

        Mybook.setOnClickListener {

            var name = Myuser.text.toString().trim()
            var dishroom = Mydishroom.text.toString().trim()
            var time = Mytime.text.toString().trim()
            var time_id = System.currentTimeMillis().toString()

            //progress bar
            var progress = ProgressDialog(this)
            progress.setTitle("Saving Data")
            progress.setMessage("Please Wait")

//validate

            if (name.isEmpty() || dishroom.isEmpty() || time.isEmpty()) {

                Toast.makeText(this, "Cannot Submit an empty field", Toast.LENGTH_SHORT).show()
            }  else {

                var my_child = FirebaseDatabase.getInstance().reference.child("Names/" + time_id)
                var user_data = User(name, dishroom, time, time_id)

                //show progress
                progress.show()

                my_child.setValue(user_data).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Data Uploaded", Toast.LENGTH_SHORT).show()

                        //navigate
                        var gotoview = Intent(this, ViewUsers::class.java)
                        startActivity(gotoview)

                    } else {

                        Toast.makeText(this, "Failed to Upload Data", Toast.LENGTH_SHORT).show()

                    }


                }


            }


            }


    }
}