package com.example.prototipo_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.prototipo_app.databinding.FragmentPostagemBinding


class PostagemFragment : Fragment() {

    private lateinit var binding: FragmentPostagemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPostagemBinding.inflate(layoutInflater, container, false)

        binding.buttonPostar.setOnClickListener {
            findNavController().navigate(R.id.action_postagemFragment_to_feedFragment)
        }

        return binding.root


    }
}