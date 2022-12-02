package com.example.gridmap5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NinthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sdg_info)
        supportActionBar?.hide()
    }
}