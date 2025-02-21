package org.example;

import org.example.LinkedList.SingleLinkedList;

import java.util.Arrays;

//import org.example.TaskList.tasksArray;
import static org.example.User.usersArray;

public class Tasks {

    public String description;
    public boolean completion;

//    task constructor / makes tasks with desc and completion boolean, instances a new tasklist as a singlelinkedlist and is then inserted into the linked list at
//    at the next empty spot where the value is the current task
    public Tasks(String description){
        this.description = description;
        this.completion = false;
        SingleLinkedList taskList = new SingleLinkedList();
        taskList.insertInLinkedList(this, taskList.size);
    }

//    this adds tasks to the tasklist array by iterating through the array (not arraylist. theres only 10 available slots. they all default to null)
//    as such, it looks until it finds a null spot (just like the users method) and then replace that null with the task
    public static void addToTasksArray(String description, TaskList taskList){
        for (int i = 0; i<taskList.tasksArray.length;i++){
            if(taskList.tasksArray[i] ==null){
                taskList.tasksArray[i] = new Tasks(description);
                System.out.println("Task successfully Created");
                System.out.println(Arrays.toString(taskList.tasksArray));
                return;
            }

        }
    }

    public void setCompletion(){
        this.completion = true;
    }

    public boolean isCompletion() {
        return completion;
    }

    public String getDescription() {
        return description;
    }

//    tostring to show tasks in a nice way with Y or N for completion
    @Override
    public String toString(){
        return(description + " : " + (completion ? "Y" : "N" ));
    }
}
