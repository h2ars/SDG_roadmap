package com.example.gridmap5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val bangBtn = findViewById<Button>(R.id.banBtn)
        bangBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        val bhutBtn = findViewById<Button>(R.id.bhuBtn)
        bhutBtn.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        val indiBtn = findViewById<Button>(R.id.indBtn)
        indiBtn.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
        val maldBtn = findViewById<Button>(R.id.malBtn)
        maldBtn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
        val pakiBtn = findViewById<Button>(R.id.pakBtn)
        pakiBtn.setOnClickListener {
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }
        val srilBtn = findViewById<Button>(R.id.sriBtn)
        srilBtn.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            startActivity(intent)
        }
        val chinBtn = findViewById<Button>(R.id.chiBtn)
        chinBtn.setOnClickListener {
            val intent = Intent(this, EigthActivity::class.java)
            startActivity(intent)
        }
    }
}