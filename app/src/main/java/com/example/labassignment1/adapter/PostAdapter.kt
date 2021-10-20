package com.example.labassignment1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labassignment1.databinding.ItemPostLayoutBinding
import com.example.labassignment1.model.PostModel

class PostAdapter(private val postList: ArrayList<PostModel>) :
    RecyclerView.Adapter<PostAdapter.PostVH>() {
    class PostVH(private val binding: ItemPostLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(post: PostModel) {
            binding.tvUserName.text = post.userName
            binding.tvPostText.text = post.postContent
            binding.profileImage.setImageResource(post.image)
            binding.tvTime.text = post.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostVH {
        val binding =
            ItemPostLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostVH(binding)
    }

    override fun onBindViewHolder(holder: PostVH, position: Int) {
        holder.bindData(postList[position])
    }

    override fun getItemCount(): Int =  postList.size

}