package com.example.test_iagomartin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btn1 = findViewById<Button>(R.id.buttonvolver)
        val btntoast = findViewById<Button>(R.id.buttontoast)
        val btnlogcat = findViewById<Button>(R.id.buttonlogcat)

        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnlogcat.setOnClickListener {
            Log.d("MainActivity3", "Boto apretat Logcat")
        }

        btntoast.setOnClickListener {
            Toast.makeText(this, "Boto apretat Toast", Toast.LENGTH_SHORT).show()
        }
    }
}