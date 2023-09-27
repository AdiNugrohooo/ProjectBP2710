package com.example.projectbp2710

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnlogin:Button = findViewById(R.id.button2)
        btnlogin.setOnClickListener{
            val intenHome = Intent( this,HomeActivity2::class.java)
            startActivity(intenHome)
        }
    }
}