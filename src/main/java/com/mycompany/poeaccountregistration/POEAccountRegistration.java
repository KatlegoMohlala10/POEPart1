/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeaccountregistration;
import java.util.*;
/**
 *
 * @author Katlego Mohlala
 */
public class POEAccountRegistration {

    public static void main(String[] args) {
        //Declarations
        String firstName, lastName, username, password;
        Scanner log = new Scanner(System.in);
        //Initiate the class object 
        Login ext = new Login();
        
        //Prompting user
        System.out.println("Enter your first name: ");
        firstName = log.next();
        System.out.println("Enter your last name: ");
        lastName = log.next();
        System.out.println("Create a new username: ");
        username = log.next();
        System.out.println("Create a new password: ");
        password = log.next();
        
        //Register user
        ext.registerUser(username, password, firstName, lastName);
        
        // Ask for login
        System.out.println("\nPlease log in to your account.");
        System.out.println("Enter username: ");
        String loginUsername = log.next();

        System.out.println("Enter password: ");
        String loginPassword;
        loginPassword = log.next();
        
        // Check login status
        ext.returnLoginStatus(loginUsername, loginPassword);
        
        log.close();
    }
}
