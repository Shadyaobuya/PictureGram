package com.example.picgram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageThree : AppCompatActivity() {
    lateinit var pg4next: Button
    lateinit var pg3prev: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_three)
        castViews()
        clickNext()
        clickPrevious()
    }
    fun castViews() {
        pg4next = findViewById<Button>(R.id.btnnxt)
        pg3prev=findViewById<Button>(R.id.btnprv)

    }

    fun clickNext() {
        pg4next.setOnClickListener {
            var intent = Intent(baseContext, PageFour::class.java)
            startActivity(intent)
        }
    }
    fun clickPrevious(){
        pg3prev.setOnClickListener {
            var intent = Intent(baseContext, pageTwo::class.java)
            startActivity(intent)

        }

    }}