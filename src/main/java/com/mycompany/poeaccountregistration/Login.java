/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeaccountregistration;
import java.util.*;
/**
 *
 * @author Katlego Mohlala
 */
public class Login {
    private String storedUsername;
    private String storedPassword;
    private String firstName;
    private String lastName;
    
    // Method to check username validity
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    // Method to check password complexity
    public boolean checkPasswordComplexity(String password) {
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");
        return password.length() >= 8 && hasUpperCase && hasNumber && hasSpecialChar;
    }
    // Method to register the user and store their information
    public void registerUser(String username, String password, String firstName, String lastName) {
       if (checkUsername(username) && checkPasswordComplexity(password)) {
           this.storedUsername = username;
           this.storedPassword = password;
           this.firstName = firstName;
           this.lastName = lastName;
           System.out.println("Username and Password successfully captured.");
       } 
       else {
           if (!checkUsername(username)) {
                System.out.println("Username incorrectly formatted, please ensure the username contains an underscore and is no more than 5 characters in length");
            }
            if (!checkPasswordComplexity(password)) {
                System.out.println("Password is incorrectly formatted, please ensure the password is at least 8 characters in length, contains a capital letter, contains a number, and contains a special character.");
            }
        }
    }
}
