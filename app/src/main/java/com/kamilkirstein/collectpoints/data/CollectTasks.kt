package com.kamilkirstein.collectpoints.data

class CollectTasks {

    fun loadCollectableTasks() : List<Task>
    {
        //TODO how to save the correct path to the image inside the drawable folder
        return listOf<Task>(
            Task(name = "Fahrad fahren", description = "Fahre Fahrad stärkere deine Kondtition und Ausdauer!", type= TaskType.COLLECTPOINTS, imageId ="@drawable\\peleton_bike_women" ),
            Task(name = "Fahrad fahren", description = "Fahre Fahrad stärkere deine Kondtition und Ausdauer!", type= TaskType.COLLECTPOINTS, imageId ="@drawable\\peleton_bike_women" ),
            Task(name = "Fahrad fahren", description = "Fahre Fahrad stärkere deine Kondtition und Ausdauer!", type= TaskType.COLLECTPOINTS, imageId ="@drawable\\peleton_bike_women" ),
            Task(name = "Fahrad fahren", description = "Fahre Fahrad stärkere deine Kondtition und Ausdauer!", type= TaskType.COLLECTPOINTS, imageId ="@drawable\\peleton_bike_women" ),
            Task(name = "Fahrad fahren", description = "Fahre Fahrad stärkere deine Kondtition und Ausdauer!", type= TaskType.COLLECTPOINTS, imageId ="@drawable\\peleton_bike_women" ),
            Task(name = "Fahrad fahren", description = "Fahre Fahrad stärkere deine Kondtition und Ausdauer!", type= TaskType.COLLECTPOINTS, imageId ="@drawable\\peleton_bike_women" )
        )
    }
}