package com.example.cheermer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var email: EditText
    private lateinit var pass1: EditText
    private lateinit var pass2: EditText
    private lateinit var register: Button
    private lateinit var account: TextView
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        username = findViewById(R.id.edtusereg)
        email = findViewById(R.id.edtemailreg)
        pass1 = findViewById(R.id.edtpassreg1)
        pass2 = findViewById(R.id.edtpassreg2)
        register = findViewById(R.id.btnreg)
        account = findViewById(R.id.txtacc)

        auth = FirebaseAuth.getInstance()


        account.setOnClickListener {

            var gotolog = Intent(this, LoginActivity::class.java)
            startActivity(gotolog)
        }

        register.setOnClickListener {

            var myuser = username.text.toString().trim()
            var myemail = email.text.toString().trim()
            var mypass1 = pass1.text.toString().trim()
            var mypass2 = pass2.text.toString().trim()

            //validate user info
            if (myuser.isEmpty() || myemail.isEmpty() || mypass1.isEmpty() || mypass2.isEmpty()) {


                Toast.makeText(this, "Cannot Submit an Empty field", Toast.LENGTH_SHORT).show()

            } else {

               // auth.createUserWithEmailAndPassword(myuser, mypass1).addOnCompleteListener(this) {

                    //if (it.isSuccessful) {
                        Toast.makeText(this, "User Created Successfully", Toast.LENGTH_SHORT).show()

                        var gotomenu = Intent(this, MenuActivity::class.java)
                        startActivity(gotomenu)

                        //navigate back to login


                    }
                }
            }
        }
   // }
//}


