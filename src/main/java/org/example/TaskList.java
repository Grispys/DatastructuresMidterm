package org.example;


import java.util.Arrays;

public class TaskList {
    public Tasks[] tasksArray = new Tasks[10];

    public TaskList(){

    }

    public void createTask(String description){
        Tasks.addToTasksArray(description, this);

    }


    public String showTaskList(){
        return Arrays.toString(tasksArray);
    }

    public void setCompletion(){

    }
}
