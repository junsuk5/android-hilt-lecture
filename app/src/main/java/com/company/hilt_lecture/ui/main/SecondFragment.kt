package com.company.hilt_lecture.ui.main

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.company.hilt_lecture.R
import com.company.hilt_lecture.data.MyRepository
import com.company.hilt_lecture.di.qualifier.ActivityHash
import com.company.hilt_lecture.di.qualifier.AppHash
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_second.*
import javax.inject.Inject

@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {
    private val viewModel by viewModels<MainViewModel>()

    @Inject
    lateinit var repository: MyRepository

    @AppHash
    @Inject
    lateinit var applicationHash: String

    @ActivityHash
    @Inject
    lateinit var activityHash: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }

        Log.d("SecondFragment", "${repository.hashCode()}")
        Log.d("SecondFragment", "appHash: $applicationHash")
        Log.d("SecondFragment", "activityHash: $activityHash")
        Log.d("SecondFragment", "viewModel: ${viewModel.getRepositoryHash()}")
    }
}