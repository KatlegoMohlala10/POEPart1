/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeaccountregistration;
import javax.swing.JOptionPane;
/**
 *
 * @author Katlego Mohlala
 */
public class POEAccountRegistration {
    //GitHub repository is https://github.com/KatlegoMohlala10/POEPart1.git
    
    public static void main(String[] args) {
        // Prompt user for registration details using JOptionPane
        String firstName = JOptionPane.showInputDialog("Enter your First Name:");
        String lastName = JOptionPane.showInputDialog("Enter your Last Name:");
        String username = JOptionPane.showInputDialog("Create a Username:");
        String password = JOptionPane.showInputDialog("Create a Password:");
            
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
        }
    }
}
