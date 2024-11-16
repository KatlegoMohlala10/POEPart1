/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeaccountregistration;

import javax.swing.JOptionPane;
/**
 *
 * @author Katlego Mohlala
 */
public class Login {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private boolean isLoggedIn = false;
    
    public void registerUser(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (checkUsername(username) && checkPasswordComplexity(password)) {
            this.username = username;
            this.password = password;
            JOptionPane.showMessageDialog(null, "User successfully registered!");
        } else {
            JOptionPane.showMessageDialog(null, "Registration failed due to invalid username or password.");
        }
    }
    
    private boolean checkUsername(String username) {
        boolean isValid = username.contains("_") && username.length() <= 5;
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Username incorrectly formatted. It should contain an underscore and be no more than 5 characters.");
        }
        return isValid;
    }
    
    public boolean checkPasswordComplexity(String password) {
        // Check if the password is at least 8 characters long
        boolean hasLength = password.length() >= 8;

        // Check if the password contains at least one uppercase letter
        boolean hasUpperCase = password.matches(".*[A-Z].*");

        // Check if the password contains at least one number
        boolean hasNumber = password.matches(".*\\d.*");

        // Check if the password contains at least one special character
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

        // Password is valid if it meets all the conditions
        if (hasLength && hasUpperCase && hasNumber && hasSpecialChar) {
            System.out.println("Password successfully captured");
            return true;
        } else {
            System.out.println("Password is incorrectly formatted. " +
                "Please ensure the password is at least 8 characters, " +
                "contains a capital letter, a number, and a special character.");
            return false;
        }
    }

    // Method to verify login credentials
    public boolean returnLoginStatus(String username, String password) {
        // Check if username exists and password matches
        return users.containsKey(username) && users.get(username).equals(password);
    }
    
    // Method to show the menu after successful login
    public void showMenu() {
        while (true) {
            String menu = "1. Add Tasks\n2. Show Reports (coming soon)\n3. Quit";
            String choice = JOptionPane.showInputDialog(menu);

            switch (choice) {
                case "1":
                    // Ask how many tasks to add
                    String taskCountStr = JOptionPane.showInputDialog("How many tasks would you like to add?");
                    int taskCount = Integer.parseInt(taskCountStr);

                    Task task = new Task(taskCount); // Create a new task instance
                    task.captureMultipleTasks(taskCount); // Capture the specified number of tasks
                    break;
                case "2":
                    // Show report functionality (to be implemented)
                    JOptionPane.showMessageDialog(null, "Reports are under development.", "Report", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "3":
                    // Exit the program
                    JOptionPane.showMessageDialog(null, "Thank you for using EasyKanban! Exiting...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
