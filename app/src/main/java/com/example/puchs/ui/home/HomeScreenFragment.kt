package com.example.puchs.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.puchs.R
import com.example.puchs.data.model.Post
import com.example.puchs.databinding.FragmentHomeScreenBinding
import com.google.firebase.Timestamp


class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicializa view binding
        binding = FragmentHomeScreenBinding.bind(view)

        // Lista de publicaciones
        val postList = listOf(
            Post(
                "https://cdn-icons-png.flaticon.com/512/149/149071.png", // Imagen del perfil
                "Jonathan", // Nombre del perfil
                Timestamp.now(), // Timestamp actual
                "https://www.example.com/image1.jpg" // Imagen del post
            ),
            Post(
                "https://cdn-icons-png.flaticon.com/512/149/149071.png",
                "Ana",
                Timestamp.now(),
                "https://www.example.com/image2.jpg"
            )
        )

        // Asigna el adaptador al RecyclerView
        binding.rvHome.adapter = HomeScreenAdapter(postList)
    }
}

