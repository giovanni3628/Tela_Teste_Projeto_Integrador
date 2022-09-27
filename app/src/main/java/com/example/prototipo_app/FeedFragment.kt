package com.example.prototipo_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prototipo_app.adapter.PostagemAdapter
import com.example.prototipo_app.databinding.FragmentFeedBinding
import com.example.prototipo_app.model.Postagem

class FeedFragment : Fragment() {

    private lateinit var binding: FragmentFeedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFeedBinding.inflate(layoutInflater, container, false)

        val listPostagem = listOf(
            Postagem(
                "ajuda",
                "Giovanni",
                "aaaaaaaaaaaa",
                10000.00,
                "Preciso de ajuda para comprar medicamentos",
                "2022-09-27",
                "Medicamentos",
            ),
            Postagem(
                "Cirurgia",
                "João Da Silva",
                "bbbbbbbbbbbbb",
                5000.00,
                "Preciso de ajuda para fazer uma cirurgia no joelho",
                "2022-07-30",
                "Cirurgia",
            ),
        )

        val adapter = PostagemAdapter()
        binding.recyclerPostagem.layoutManager = LinearLayoutManager(context)
        binding.recyclerPostagem.adapter = adapter
        binding.recyclerPostagem.setHasFixedSize(true)

        adapter.setList(listPostagem)

        binding.buttonCriar3.setOnClickListener {
            findNavController().navigate(R.id.action_feedFragment_to_postagemFragment)
        }

        return binding.root
    }
}