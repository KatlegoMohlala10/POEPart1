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
            
            // Simulating registration and storing the details
        Login login = new Login();
        login.registerUser(firstName, lastName, username, password);

        // Proceed to login
        String loginUsername = JOptionPane.showInputDialog("Enter your Username:");
        String loginPassword = JOptionPane.showInputDialog("Enter your Password:");

        // Check if login is successful
        if (login.returnLoginStatus(loginUsername, loginPassword)) {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban!", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
            login.showMenu();
        } else {
            JOptionPane.showMessageDialog(null, "Login Failed! Incorrect username or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
