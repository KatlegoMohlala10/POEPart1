/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeaccountregistration;

import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author Katlego Mohlala
 */
public class Login {
    // HashMap to store user details (username -> password)
    private HashMap<String, String> users = new HashMap<>();
    private int taskCounter = 0;  // To keep track of the task numbers
    
    // Method to register a new user
    public void registerUser(String firstName, String lastName, String username, String password) {
        // Ideally, you'd add validation for username and password here
        if (username.length() <= 5 && username.contains("_") && password.length() >= 8) {
            users.put(username, password);
            JOptionPane.showMessageDialog(null, "Registration Successful! You can now log in.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
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
