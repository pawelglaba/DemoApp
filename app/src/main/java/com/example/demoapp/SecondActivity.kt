package com.example.demoapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_second)

        textViewResult = findViewById(R.id.textViewResult)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getStringExtra("EXTRA_AGE")

        textViewResult.text = "Name: $name\nAge: $age"
    }
}
