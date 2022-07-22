package com.mukisasamuel.livetv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SpalshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)
        Handler().postDelayed({
            val mIntent = Intent(this@SpalshActivity, LoginActivity::class.java)
            startActivity(mIntent)
            finish()
        }, 2000)
    }
}