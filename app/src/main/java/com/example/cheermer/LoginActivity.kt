package com.example.cheermer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var user: EditText
    private lateinit var password: EditText
    private lateinit var login: Button
    private lateinit var signup: TextView
    private lateinit var auth: FirebaseAuth

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        user = findViewById(R.id.edtuserlog)
        password = findViewById(R.id.edtpasslog)
        login = findViewById(R.id.btnlog)
        signup = findViewById(R.id.txtsignup)

        auth = FirebaseAuth.getInstance()

        signup.setOnClickListener {

            var gotoreg = Intent(this, RegisterActivity::class.java)
            startActivity(gotoreg)

        }
        login.setOnClickListener {

            var myuser = user.text.toString().trim()
            var mypass = password.text.toString().trim()

            //validate
            if (myuser.isEmpty() || mypass.isEmpty()){

                Toast.makeText(this, "Cannot Submit an Empty field", Toast.LENGTH_SHORT).show()

            } else {
                //auth.signInWithEmailAndPassword(myuser, mypass).addOnCompleteListener(this) {

                    //if (it.isSuccessful) {
                        Toast.makeText(this, "Logged in Successfully", Toast.LENGTH_SHORT).show()

                        //
                        var gotomain = Intent(this, MenuActivity::class.java)
                        startActivity(gotomain)
                        finish()

                    //} else {

                        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
                   // }
                //}
            }
        }

    }
}