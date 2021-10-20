package com.example.labassignment1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.labassignment1.adapter.FeedAdapter
import com.example.labassignment1.databinding.FragmentFeedBinding
import com.example.labassignment1.model.UserModel

class FeedFragment : Fragment() {

    lateinit var binding: FragmentFeedBinding
    lateinit var feedAdapter: FeedAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFeedBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userList = ArrayList<UserModel>()

        userList.add(UserModel(R.drawable.image_1, "Umair Ghora", "Hello! Ghora speaking.", "3:50 pm", "3"))
        userList.add(UserModel(R.drawable.image_2, "Faizan", "Vro CG ka scope ha", "Yesterday", "8"))
        userList.add(UserModel(R.drawable.image_3, "Saad", "khikhikhi", "20/2/2021", "2"))
        userList.add(UserModel(R.drawable.image_4, "Ali", "lorum ipsumm text", "12/3/2021", "6"))
        userList.add(UserModel(R.drawable.image_5, "Aamish", "Okay", "11/3/2021", "9+"))
        userList.add(UserModel(R.drawable.image_6, "Arslan", "Hello peter", "4/3/2021", "1"))
        userList.add(UserModel(R.drawable.image_1, "Umair Ghora", "Hello! Ghora speaking.", "3:50 pm", "3"))
        userList.add(UserModel(R.drawable.image_2, "Faizan", "Vro CG ka scope ha", "Yesterday", "8"))
        userList.add(UserModel(R.drawable.image_3, "Saad", "khikhikhi", "20/2/2021", "2"))
        userList.add(UserModel(R.drawable.image_4, "Ali", "lorum ipsumm text", "12/3/2021", "6"))
        userList.add(UserModel(R.drawable.image_5, "Aamish", "Okay", "11/3/2021", "9+"))
        userList.add(UserModel(R.drawable.image_6, "Arslan", "Hello peter", "4/3/2021", "1"))
        userList.add(UserModel(R.drawable.image_1, "Umair Ghora", "Hello! Ghora speaking.", "3:50 pm", "3"))
        userList.add(UserModel(R.drawable.image_2, "Faizan", "Vro CG ka scope ha", "Yesterday", "8"))
        userList.add(UserModel(R.drawable.image_3, "Saad", "khikhikhi", "20/2/2021", "2"))
        userList.add(UserModel(R.drawable.image_4, "Ali", "lorum ipsumm text", "12/3/2021", "6"))
        userList.add(UserModel(R.drawable.image_5, "Aamish", "Okay", "11/3/2021", "9+"))
        userList.add(UserModel(R.drawable.image_6, "Arslan", "Hello peter", "4/3/2021", "1"))

        feedAdapter = FeedAdapter(userList)

        binding.feedRecyclerview.adapter = feedAdapter

        binding.feedRecyclerview.setOnClickListener {

            findNavController().navigate(R.id.action_feedFragment_to_chatFragment)
        }
    }

}