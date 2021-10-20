package com.example.labassignment1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.labassignment1.adapter.PostAdapter
import com.example.labassignment1.databinding.FragmentHomeBinding
import com.example.labassignment1.model.PostModel

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val postList = arrayListOf<PostModel>()

        postList.add(PostModel(1,"Shoaib kakal", "10 min ago", R.drawable.image_1, resources.getString(R.string.post1)))
        postList.add(PostModel(1,"Shaheer Ahmed", "13 min ago", R.drawable.image_2, resources.getString(R.string.post1)))
        postList.add(PostModel(1,"Adil", " 1 hour ago", R.drawable.image_3, resources.getString(R.string.post1)))
        postList.add(PostModel(1,"Khalid Mehmood", "2 hour ago", R.drawable.image_4, resources.getString(R.string.post1)))
        postList.add(PostModel(1,"Ali lisan", "1 day ago", R.drawable.image_5, resources.getString(R.string.post1)))
        postList.add(PostModel(1,"Farukh", "4 day ago", R.drawable.image_6, resources.getString(R.string.post1)))


        val postAdapter = PostAdapter(postList)

        binding.postRecyclerview.adapter = postAdapter
    }





}