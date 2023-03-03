package com.example.homework6_4.buttons

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homework6_4.databinding.FragmentButtonsBinding
import com.example.homework6_4.counter.viewModel.CounterViewModel

class ButtonsFragment : Fragment() {

    private lateinit var binding: FragmentButtonsBinding
    private lateinit var viewModel: CounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(CounterViewModel::class.java)

        binding.incrementButton.setOnClickListener {
            viewModel.increment()
        }

        binding.decrementButton.setOnClickListener {
            viewModel.decrement()
        }
    }
}
