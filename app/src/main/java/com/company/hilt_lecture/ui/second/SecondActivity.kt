package com.company.hilt_lecture.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.company.hilt_lecture.R
import com.company.hilt_lecture.ui.data.MyRepository

class SecondActivity : AppCompatActivity() {

    val repository = MyRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("SecondActivity", "${repository.hashCode()}")
    }
}