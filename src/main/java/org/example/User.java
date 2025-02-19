package org.example;

import java.util.Scanner;

public class User {
    public static Scanner scanner = new Scanner(System.in);
    private final String username;
    private final String password;
    private final TaskList todo;

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

    public TaskList getTodo() {
        return todo;
    }


}
