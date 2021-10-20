package com.example.labassignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.labassignment1.adapter.ChatAdapter
import com.example.labassignment1.databinding.FragmentChatBinding
import com.example.labassignment1.model.ChatMessage


class ChatFragment : Fragment() {

    lateinit var binding: FragmentChatBinding
    private lateinit var chatMessages: ArrayList<ChatMessage>
    private lateinit var chatAdapter: ChatAdapter

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
        binding = FragmentChatBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chatMessages.add(ChatMessage("1", "2", "Hello this is shoaib khalid", "12:04pm"))
        chatMessages.add(ChatMessage("2", "2", "Hello this is shoaib khalid", "12:04pm"))
        chatMessages.add(ChatMessage("2", "2", "Hello this is shoaib khalid", "12:04pm"))
        chatMessages.add(ChatMessage("1", "2", "Hello this is shoaib khalid", "12:04pm"))
        chatMessages.add(ChatMessage("1", "2", "Hello this is shoaib khalid", "12:04pm"))

        chatAdapter = ChatAdapter(chatMessages, "1")
        binding.chatRecyclerview.adapter = chatAdapter

    }
}