package com.kamilkirstein.collectpoints.data

import androidx.annotation.DrawableRes

enum class TaskType
{
    COLLECTPOINTS,
    SPENDPOINTS
}

data class Task(val name : String,
                val description : String,
                val type : TaskType,
                @DrawableRes val imageId : Int)
{
    val pointValue : Int
        get() = when (type) {
            TaskType.COLLECTPOINTS -> pointValue
            TaskType.SPENDPOINTS -> -pointValue
        }
}
