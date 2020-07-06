package com.company.hilt_lecture.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.company.hilt_lecture.R
import com.company.hilt_lecture.ui.data.MyRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}