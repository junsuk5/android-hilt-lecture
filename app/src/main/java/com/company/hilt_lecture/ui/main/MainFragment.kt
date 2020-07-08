package com.company.hilt_lecture.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.company.hilt_lecture.R
import com.company.hilt_lecture.data.MyRepository
import com.company.hilt_lecture.di.qualifier.ActivityHash
import com.company.hilt_lecture.di.qualifier.AppHash
import com.company.hilt_lecture.ui.second.SecondActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    private val activityViewModel by activityViewModels<MainViewModel>()
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

        button_activity.setOnClickListener {
            val intent = Intent(requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }

        button_fragment.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }

        Log.d("MainFragment", "${repository.hashCode()}")
        Log.d("MainFragment", "appHash: $applicationHash")
        Log.d("MainFragment", "activityHash: $activityHash")
        Log.d("MainFragment", "viewModel: ${viewModel.getRepositoryHash()}")
        Log.d("MainFragment", "activityViewModel: ${activityViewModel.getRepositoryHash()}")
    }
}