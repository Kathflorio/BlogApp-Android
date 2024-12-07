package com.example.puchs.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.puchs.R
import com.example.puchs.data.model.Post
import com.example.puchs.databinding.FragmentHomeScreenBinding
import com.example.puchs.ui.home.adapter.HomeScreenAdapter
import com.google.firebase.Timestamp


class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicializa view binding
        binding = FragmentHomeScreenBinding.bind(view)

        // Lista de publicaciones
        val postList = listOf(
            Post("https://cdn-icons-png.flaticon.com/256/16429/16429645.png",
                "Jonathan", Timestamp.now(),
                "https://www.post-it.com.mx/wps/wcm/connect/e8c3a978-4e86-4ac9-98b4-ee8dcdb0cfbe/SOSD_Post-it_Thumbnails_02_515x350.jpg?MOD=AJPERES&CACHEID=ROOTWORKSPACE-e8c3a978-4e86-4ac9-98b4-ee8dcdb0cfbe-otMRPkg"),
            Post("https://cdn-icons-png.flaticon.com/256/16429/16429645.png",
                "Jonathan", Timestamp.now(),
                "https://www.post-it.com.mx/wps/wcm/connect/e8c3a978-4e86-4ac9-98b4-ee8dcdb0cfbe/SOSD_Post-it_Thumbnails_02_515x350.jpg?MOD=AJPERES&CACHEID=ROOTWORKSPACE-e8c3a978-4e86-4ac9-98b4-ee8dcdb0cfbe-otMRPkg"),
            Post("https://cdn-icons-png.flaticon.com/256/16429/16429645.png",
                "Jonathan", Timestamp.now(),
                "https://www.post-it.com.mx/wps/wcm/connect/e8c3a978-4e86-4ac9-98b4-ee8dcdb0cfbe/SOSD_Post-it_Thumbnails_02_515x350.jpg?MOD=AJPERES&CACHEID=ROOTWORKSPACE-e8c3a978-4e86-4ac9-98b4-ee8dcdb0cfbe-otMRPkg")
        )

        // Asigna el adaptador al RecyclerView
        binding.rvHome.adapter = HomeScreenAdapter(postList)
    }
}

