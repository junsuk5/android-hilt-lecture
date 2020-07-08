package com.company.hilt_lecture.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.company.hilt_lecture.data.MyRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: MyRepository
) : ViewModel() {

    fun getRepositoryHash() = repository.toString()
}