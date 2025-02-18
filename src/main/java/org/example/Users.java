package org.example;

public class Users {
    private String username;
    private String password;
    private TaskList todo;
    public void Users(String username, String password){
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
