package com.example.picgram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageFour : AppCompatActivity() {
    lateinit var pg5next: Button
    lateinit var pg4prev: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_four)
        castViews()
        clickNext()
        clickPrevious()
    }
    fun castViews() {
        pg5next = findViewById<Button>(R.id.btnxt)
        pg4prev=findViewById<Button>(R.id.btnpr)

    }
    fun clickNext() {
        pg5next.setOnClickListener {
            var intent = Intent(baseContext, PageFive::class.java)
            startActivity(intent)
        }
    }
    fun clickPrevious(){
        pg4prev.setOnClickListener {
            var intent = Intent(baseContext, PageThree::class.java)
            startActivity(intent)

        }

    }
}