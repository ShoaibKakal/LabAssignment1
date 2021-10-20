package com.example.labassignment1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labassignment1.databinding.ItemUserLayoutBinding
import com.example.labassignment1.model.UserModel

class FeedAdapter(val userList: ArrayList<UserModel>) : RecyclerView.Adapter<FeedAdapter.FeedVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedVH {
        val binding =
            ItemUserLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FeedVH(binding)
    }

    override fun onBindViewHolder(holder: FeedVH, position: Int) {
        holder.bindView(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class FeedVH(private val binding: ItemUserLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(user: UserModel) {
            binding.tvUserName.text = user.name
            binding.tvMessage.text = user.message
            binding.tvDate.text = user.date
            binding.profileImage.setImageResource(user.image)
            binding.tvMsgCount.text = user.msgCount

        }

    }

}