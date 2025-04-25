package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText
    private lateinit var buttonSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextAge)
        buttonSend = findViewById(R.id.buttonSend)

        buttonSend.setOnClickListener {
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_AGE", age)
            }
            startActivity(intent)
        }
    }
}