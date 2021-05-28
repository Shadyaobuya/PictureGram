package com.example.picgram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pageTwo : AppCompatActivity() {
    lateinit var pg3image: Button
    lateinit var pgprev:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)
        castViews()
        clickNext()
        clickPrevious()
    }

    fun castViews() {
        pg3image = findViewById<Button>(R.id.btnpg3)
        pgprev=findViewById<Button>(R.id.btnpg2prev)

    }

    fun clickNext() {
        pg3image.setOnClickListener {
            var intent = Intent(baseContext, PageThree::class.java)
            startActivity(intent)
        }
    }
    fun clickPrevious(){
        pgprev.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)

    }


}}