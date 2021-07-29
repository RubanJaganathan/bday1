package com.myapp.bday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val message =" "+ intent.getStringExtra (NAME_1) +" "
        findViewById<TextView>(R.id.textView2).apply{text = message}

    }
}