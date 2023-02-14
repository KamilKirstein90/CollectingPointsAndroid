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


class TaskAdapter(private val context : Context,
                  private val dataset : List<Task>
                  ) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
            val text_header1 = view.findViewById<TextView>(R.id.text_header1)
            val text_description = view.findViewById<TextView>(R.id.text_description)
            val image = view.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
       // create new View
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent,false)

        return TaskViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = dataset[position]

        holder.text_header1.text = task.name
        holder.text_description.text = task.description
    // TODO set the image by writing the image path to it

    }

    override fun getItemCount() = dataset.size


}