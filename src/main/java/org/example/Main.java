package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.User.usersArray;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
//    only ten users can be made

//    users are made and sign up is done in the main class

    public static void signUp(){
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();

        //      checks that a username like this one doesn't already exist. checks that any account in users is both not null or if the given username is already there
//        also got a warning here that this 'for' does not loop? though it clearly does. i dunno man
        for (int i = 0; i<usersArray.length;i++) {
            if (usersArray[i] != null && usersArray[i].getUsername().equals(username)) {
                System.out.println("User with that name already exists.");
                return;
//                standard blank checks for name and password
            }else if(username.isEmpty()){
                System.out.println("User name cannot be empty.");
                return;
            } else{
                System.out.println("Please enter your password: ");
                String password= scanner.nextLine();
                if(password.isEmpty()){
                    System.out.println("Password cannot be blank.");
                    return;
                }
//              replaces the first null with the new user data
                for (int x = 0; x<usersArray.length;x++){
                    if(usersArray[x] ==null){
                        usersArray[x] = new User(username, password);
                        System.out.println("Account successfully Created");
                        System.out.println(Arrays.toString(usersArray));
                        return;
                    }

                }
//                prints if there's no room in the array
                System.out.println("No more room :(");
                return;
            }
        }




    }


//    my tried and true sign in method. compares given name and password before displaying further UI.
    public static void signIn(){
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        User signedInUser = null;

//        System.out.println(users);

        for(User user : usersArray){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                signedInUser = user;
                System.out.println("Welcome, " + signedInUser.getUsername());
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
                            System.out.println(signedInUser.getTodo());
                            break;
                        case 2:
                            signedInUser.taskCreation("test task");
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

//    main to display options
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