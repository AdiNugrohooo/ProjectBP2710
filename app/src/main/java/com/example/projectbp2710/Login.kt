package com.example.projectbp2710

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnlogin:Button = findViewById(R.id.button2)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val LogModel = LoginModel()

        btnlogin.setOnClickListener{
        LogModel.Username = txtUsername.text.toString()
        LogModel.Password = txtPassword.text.toString()

            if (LogModel.loginCek() == true){
                val intenHome = Intent( this,HomeActivity2::class.java)
                startActivity(intenHome)
            }else{
                Toast.makeText(this,"Username/Password Salah",Toast.LENGTH_SHORT).show()
            }

        }
    }
}