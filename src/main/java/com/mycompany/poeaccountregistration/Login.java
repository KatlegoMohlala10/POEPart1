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
}
