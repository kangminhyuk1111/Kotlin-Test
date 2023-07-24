package com.example.myretrofittestapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myretrofittestapp.databinding.ItemEmgmedBinding

class EmdMedAdapter(val data: List<UserCommentResponse.UserCommentResponseItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class ViewHolder(val binding: ItemEmgmedBinding):RecyclerView.ViewHolder(binding.root){
        fun bindItem(data: UserCommentResponse.UserCommentResponseItem) = with(binding){
            tvAddr.text = data.body
            tvName.text = data.title
            tvNum.text = data.id.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = ItemEmgmedBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var currentItem = data[position]
        holder as ViewHolder
        holder.bindItem(currentItem)
    }
}