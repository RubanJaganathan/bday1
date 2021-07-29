package com.myapp.bday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val NAME_1 = "com.myapp.bday.MESSAGE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun generateCard(view: View){
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()

        val indent = Intent(this,display::class.java).apply{putExtra(NAME_1,message)}
        startActivity(indent)
    }
}