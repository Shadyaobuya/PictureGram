package com.example.picgram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var image2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        clickNext()
    }
    fun castViews(){
        image2=findViewById<Button>(R.id.btnNext)
    }
    fun clickNext(){
        image2.setOnClickListener {
            var intent=Intent(baseContext,pageTwo::class.java)
            startActivity(intent)
        }
    }
}