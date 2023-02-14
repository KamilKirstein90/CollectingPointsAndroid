package com.kamilkirstein.collectpoints.data

enum class TaskType
{
    COLLECTPOINTS,
    SPENDPOINTS
}


data class Task(val name : String, val description : String, val type : TaskType)
{
    val pointValue : Int
        get() = when (type) {
            TaskType.COLLECTPOINTS -> pointValue
            TaskType.SPENDPOINTS -> -pointValue
        }
}
