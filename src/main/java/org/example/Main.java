package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
//    only ten users can be made
    static User[] usersArray = new User[10];
//    users are made and sign up is done in the main class

    public static void signUp(){
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Please your password: ");
        String password= scanner.nextLine();

        for (int i = 0; i<usersArray.length;i++){
            if(usersArray[i] ==null){
                usersArray[i] = new User(username, password);
                System.out.println("Account successfully Created");
                break;
            } else{
                System.out.println("No more room :(");
            }
        }

        System.out.println(Arrays.toString(usersArray));

    }

    public static void signIn(){
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

//        System.out.println(users);

        for(User user : usersArray){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("Welcome, " + username);
                while (true) {
                    System.out.println("\n--- To-Do Engine ---");
                    System.out.println("1. View To-Do list");
                    System.out.println("2. Add task");
                    System.out.println("3. Task status");
                    System.out.println("4. Sign out");
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            System.out.println("Logging out...");
                            return;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            }else{
                System.out.println("Error: Invalid credentials");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- To-Do Engine ---");
            System.out.println("1. Sign in");
            System.out.println("2. Sign up");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    signIn();

                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    System.out.println("Thank you, Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}