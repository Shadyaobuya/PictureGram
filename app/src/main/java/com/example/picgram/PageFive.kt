package com.example.picgram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageFive : AppCompatActivity() {

    lateinit var pg5prev: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_five)
        castViews()
        clickPrev()
    }
    fun castViews() {
        pg5prev= findViewById<Button>(R.id.button)

    }
    fun clickPrev(){
        pg5prev.setOnClickListener {
            var intent = Intent(baseContext, PageFour::class.java)
            startActivity(intent)

        }
}}