/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poeaccountregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Katlego Mohlala
 */
public class POEAccountRegistrationTest {

     /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        Login login = new Login();
        String validUsername = "user_";
        String validPassword = "Pass123!";
        login.registerUser("John", "Doe", validUsername, validPassword);
        assertTrue(login.isLoggedIn());
    }
}
