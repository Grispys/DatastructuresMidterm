package org.example;

import java.util.Scanner;

public class User {
    public static Scanner scanner = new Scanner(System.in);
    private final String username;
    private final String password;
    public final TaskList todo;
    static User[] usersArray = new User[10];
//constructor
    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.todo = new TaskList();
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTodo() {
        return this.todo.showTaskList();
    }

//    task creation to pass to task list
    public void taskCreation(String description){
        this.todo.createTask(description);
    }


}
