package com.kamilkirstein.collectpoints.ui.dashboard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kamilkirstein.collectpoints.R
import com.kamilkirstein.collectpoints.data.Task
import com.kamilkirstein.collectpoints.databinding.ItemTaskBinding


class TaskAdapter(private val dataset: List<Task>, private val context : Context) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(private val binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root){

            val text_header1 = binding.textHeader1
            val text_description = binding.textDescription
            val image = binding.imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {

        // create ItemTaskBinding using that class and inflate with an inflator from context parent and false for attach to Parent
        val adapterLayout = ItemTaskBinding.inflate(LayoutInflater.from(context), parent, false)

        return TaskViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {

        val task = dataset[position]

        holder.text_header1.text = task.name
        holder.text_description.text = task.description
        holder.image.setImageResource(task.imageId)
    }

    override fun getItemCount() = dataset.size


}