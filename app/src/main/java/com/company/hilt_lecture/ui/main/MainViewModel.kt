package com.company.hilt_lecture.ui.main

import androidx.lifecycle.ViewModel
import com.company.hilt_lecture.data.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MyRepository
) : ViewModel() {

    fun getRepositoryHash() = repository.toString()
}