package com.example.mad_practical_4_21012021053

import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginBUTTON = findViewById<Button>(R.id.loginbtn)
        loginBUTTON.setOnClickListener {
            Intent(this@MainActivity,login_Activity::class.java).also { startActivity(it) }
        }
        val signupButton =findViewById<Button>(R.id.signupbtn)
        signupButton.setOnClickListener {
            Intent(this@MainActivity,registrationActivity::class.java).also { startActivity(it) }
        }
    }

}
}