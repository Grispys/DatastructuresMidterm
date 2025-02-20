package org.example;

import org.example.LinkedList.SingleLinkedList;

import java.util.Arrays;

//import org.example.TaskList.tasksArray;
import static org.example.User.usersArray;

public class Tasks {

    public String description;
    public boolean completion;

    public Tasks(String description){
        this.description = description;
        this.completion = false;
        SingleLinkedList taskList = new SingleLinkedList();
        taskList.insertInLinkedList(this, taskList.size);
    }

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



    public boolean isCompletion() {
        return completion;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return(description + " : " + (completion ? "Y" : "N" ));
    }
}
