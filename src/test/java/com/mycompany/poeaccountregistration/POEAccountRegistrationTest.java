/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poeaccountregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Katlego Mohlala
 */
public class POEAccountRegistrationTest {
    // Helper method to simulate JOptionPane input
    private void mockJOptionPaneInputs(String firstName, String lastName, String username, String password) {
        // Setting the input dialog responses using reflection (not shown here, as this is typically not feasible in unit tests)
        // However, for actual testing, consider using a library like Mockito to mock the JOptionPane input.
        // You can simulate user inputs like this if you have a library that allows it or test the UI separately.
    }

    @Test
    public void testUserRegistrationAndLogin() {
        // Simulate user input for registration
        String firstName = "John";
        String lastName = "Doe";
        String username = "user_test";
        String password = "Password@1";

        // Mock the input dialog to simulate user input
        mockJOptionPaneInputs(firstName, lastName, username, password);

        // Execute the CreateAccount main method to simulate registration
        POEAccountRegistration.main(null); // Simulating the main method execution

        // Create a LoginClass instance to check if the user is registered
        Login login = new Login();

        // Verify the registration by trying to log in with the same credentials
        assertTrue(login.returnLoginStatus(username, password), "Login should be successful with correct credentials after registration.");
    }

    @Test
    public void testRegistrationWithInvalidUsername() {
        // Simulate invalid username input
        String firstName = "Jane";
        String lastName = "Doe";
        String username = "invalid@username"; // Invalid username format
        String password = "Password@1";

        // Mock the input dialog to simulate user input
        mockJOptionPaneInputs(firstName, lastName, username, password);

        // Execute the CreateAccount main method to simulate registration
        POEAccountRegistration.main(null);

        // Create a LoginClass instance
        Login login = new Login();

        // Verify that the login fails with the invalid username
        assertFalse(login.returnLoginStatus(username, password), "Login should fail with an invalid username.");
    }

    @Test
    public void testRegistrationWithWeakPassword() {
        // Simulate registration with weak password
        String firstName = "Jack";
        String lastName = "Smith";
        String username = "jack_1";
        String password = "123456"; // Weak password

        // Mock the input dialog to simulate user input
        mockJOptionPaneInputs(firstName, lastName, username, password);

        // Execute the CreateAccount main method to simulate registration
        POEAccountRegistration.main(null);

        // Create a LoginClass instance
        Login login = new Login();

        // Verify that the login fails with the weak password
        assertFalse(login.returnLoginStatus(username, password), "Login should fail with a weak password.");
    }
}
