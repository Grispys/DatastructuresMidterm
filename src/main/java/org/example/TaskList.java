package org.example;


import java.util.Arrays;

public class TaskList {
    public Tasks[] tasksArray = new Tasks[10];

//    empty constructor so java doesn't get mad
    public TaskList(){

    }
//the base createTask method that takes the task from the User and Tasks, and finally adds it to the tasksArray
    public void createTask(String description){
        Tasks.addToTasksArray(description, this);

    }

//displays the list. i might change how it prints later if I don't like the appearance
    public String showTaskList(){
        return Arrays.toString(tasksArray);
    }

//    changes completion status of a given task i'll add this in later
    public void setCompletion(){

    }
}
