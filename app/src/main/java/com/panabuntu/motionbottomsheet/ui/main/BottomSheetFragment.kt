package com.panabuntu.motionbottomsheet.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.panabuntu.motionbottomsheet.R
import com.panabuntu.motionbottomsheet.databinding.FragmentBottomSheetBinding

class BottomSheetFragment : Fragment() {

    private lateinit var binding: FragmentBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)

        binding.buttonCollapsed.setOnClickListener {
            binding.root.transitionToState(R.id.collapsed)
        }

        binding.buttonHidden.setOnClickListener {
            binding.root.transitionToState(R.id.hidden)
        }

        return binding.root
    }
}