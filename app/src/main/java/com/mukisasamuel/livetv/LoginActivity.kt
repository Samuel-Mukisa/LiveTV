package com.mukisasamuel.livetv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.mukisasamuel.livetv.databinding.ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()
        binding.tvaccount.setOnClickListener{
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.tvforgot.setOnClickListener{
            val i = Intent(this@LoginActivity,ForgotPasswordActivity::class.java)
            startActivity(i)

        }
        binding.tvlogin.setOnClickListener{
            val email = binding.tvemail.text.toString()
            val pass = binding.tvpass.text.toString()
            if(email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener{
                    if(it.isSuccessful){
                        val intent = Intent(this,MainActivity::class.java)
                        startActivity(intent)
                        finish()

                    }else{
                        Toast.makeText(this,it.exception.toString(), Toast.LENGTH_LONG).show()
                    }
                }

            }else{
                Toast.makeText(this,"Empty fields are not allowed", Toast.LENGTH_LONG).show()
            }
        }
    }
}