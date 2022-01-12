package com.panabuntu.motionbottomsheet.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.commit
import com.panabuntu.motionbottomsheet.R
import com.panabuntu.motionbottomsheet.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)

        childFragmentManager.commit {
            replace(R.id.container_bottom_sheet, BottomSheetFragment())
        }

        binding.buttonToAnchor.setOnClickListener {
            binding.root.findViewById<MotionLayout>(R.id.motion_bottom_sheet)
                .transitionToState(R.id.anchor)
        }

        binding.textTest.setOnClickListener {
            Toast.makeText(requireContext(), "Test Toast", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

}