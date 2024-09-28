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
}
