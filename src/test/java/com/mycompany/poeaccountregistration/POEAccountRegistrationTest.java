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
     * Test of main method, of class POEAccountRegistration.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        POEAccountRegistration.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testUsernameCorrectlyFormatted() {
        Login ext = new Login();
        String username = "kyl_1";
        assertTrue(ext.checkUsername(username), "Username should be correctly formatted.");
    }
    @Test
    public void testUsernameIncorrectlyFormatted() {
        Login ext = new Login();
        String username = "kyle!!!!!";
        assertFalse(ext.checkUsername(username), "Username should be incorrectly formatted.");
    }
    
    @Test
    public void testPasswordMeetsComplexityRequirements() {
        Login ext = new Login();
        String password = "Ch&&sec@ke99!";
        assertTrue(ext.checkPasswordComplexity(password), "Password should meet complexity requirements.");
    }
    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {
        Login ext = new Login();
        String password = "password";
        assertFalse(ext.checkPasswordComplexity(password), "Password should not meet complexity requirements.");
    }
    
    @Test
    public void testLoginSuccessful() {
        Login ext = new Login();
        String username = "user_test";
        String password = "Password@1";
        ext.registerUser(username, password, "John", "Doe");
        assertTrue(ext.loginUser(username, password), "Login should be successful.");
    }
    @Test
    public void testLoginFailed() {
        Login ext = new Login();
        String username = "user_test";
        String password = "Password@1";
        ext.registerUser(username, password, "John", "Doe");
        assertFalse(ext.loginUser("wrong_user", "wrong_pass"), "Login should fail.");
    }
    
    
    @Test
    public void testUsernameFormatReturnsTrue() {
        Login ext = new Login();
        String username = "kyl_1";
        assertTrue(ext.checkUsername(username), "Username format check should return true.");
    }
    @Test
    public void testUsernameFormatReturnsFalse() {
        Login ext = new Login();
        String username = "kyle";
        assertFalse(ext.checkUsername(username), "Username format check should return false.");
    }
    
    @Test
    public void testPasswordComplexityReturnsTrue() {
        Login ext = new Login();
        String password = "Ch&&sec@ke99!";
        assertTrue(ext.checkPasswordComplexity(password), "Password complexity check should return true.");
    }
    @Test
    public void testPasswordComplexityReturnsFalse() {
        Login ext = new Login();
        String password = "password";
        assertFalse(ext.checkPasswordComplexity(password), "Password complexity check should return false.");
    }
}
