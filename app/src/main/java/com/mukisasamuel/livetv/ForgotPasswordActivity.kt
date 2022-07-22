package com.mukisasamuel.livetv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth

class ForgotPasswordActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        auth = FirebaseAuth.getInstance()
        val submit = findViewById<Button>(R.id.tvsubmit)
        submit.setOnClickListener{
            val email = findViewById<EditText>(R.id.tvforgotemail).text.toString()
            auth.sendPasswordResetEmail(email).addOnCompleteListener { task ->
                if(task.isSuccessful) {
                    val intent = Intent(this,AppCompatActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }

    }
}