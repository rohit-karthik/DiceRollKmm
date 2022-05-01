package com.example.mydemokmmapp.android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.mydemokmmapp.GenerateNumber

class NumberGenerator : Fragment() {

    private lateinit var binding: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = inflater.inflate(R.layout.fragment_number_generator, container, false)

        binding.findViewById<Button>(R.id.generate_button).setOnClickListener {
            getImageResource()
        }

        return binding
    }

    private fun getImageResource() {

        val minText: String = binding.findViewById<EditText>(R.id.min_value).text.toString()
        val maxText: String = binding.findViewById<EditText>(R.id.max_value).text.toString()

        if (minText == "" || maxText == "") {
            Toast.makeText(requireActivity(), "One of your values is blank!", Toast.LENGTH_SHORT).show()
            return
        }

        val minNumber: Int = minText.toInt()
        val maxNumber: Int = maxText.toInt()

        if (maxNumber <= minNumber) {
            Toast.makeText(requireActivity(), "Your max value is less than your min!", Toast.LENGTH_SHORT).show()
            return
        }

        binding.findViewById<TextView>(R.id.result_view).text =
            GenerateNumber().generateRandomNumber(minNumber, maxNumber).toString()

    }

}