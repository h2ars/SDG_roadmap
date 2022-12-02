package com.example.gridmap5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sdg_layout2)
        supportActionBar?.hide()
        val sdginfo = findViewById<Button>(R.id.sd2)
        sdginfo.setOnClickListener {
            val intent = Intent(this, NinthActivity::class.java)
            startActivity(intent)
        }
    }
}