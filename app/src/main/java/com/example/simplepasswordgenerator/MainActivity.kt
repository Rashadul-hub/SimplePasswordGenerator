package com.example.simplepasswordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.simplepasswordgeneratorn.PasswordGenerator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordGenerator =  PasswordGenerator()

        val buttonGenerator = findViewById<Button>(R.id.bt_generate)
        val showPassword = findViewById<TextView>(R.id.tv_text)

        buttonGenerator.setOnClickListener {
            val password = passwordGenerator.generatePassword(12,"coffee")
            showPassword.text = password
        }

    }
}