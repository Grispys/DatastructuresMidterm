package org.example;

public class Users {
    private String username;
    private String password;
    private TaskList todo;
    public void Users(String username, String password){
        this.username = username;
        this.password = password;
        TaskList todo = new TaskList();
        this.todo = todo;
    }
}
