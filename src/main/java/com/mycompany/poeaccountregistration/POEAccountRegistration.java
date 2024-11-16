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
    private static final Login login = new Login();
    private static final Task taskManager = new Task();
    
    public static void main(String[] args) {
        // Register and Login
        registerAndLogin();

        if (login.isLoggedIn()) {
            showMainMenu();
        }
    }
    
    private static void registerAndLogin() {
        // User Registration
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");
        String username = JOptionPane.showInputDialog("Enter username (max 5 chars, includes '_'):");
        String password = JOptionPane.showInputDialog("Enter password (min 8 chars, includes uppercase, number, special char):");
        login.registerUser(firstName, lastName, username, password);

        // User Login
        if (!login.isLoggedIn()) {
            String loginUsername = JOptionPane.showInputDialog("Enter username to log in:");
            String loginPassword = JOptionPane.showInputDialog("Enter password:");
            login.loginUser(loginUsername, loginPassword);
        }
    }
    
    private static void showMainMenu() {
        while (true) {
            String[] options = {"1. Add Task", "2. Show Report", "3. Search Task by Name", "4. Delete Task by Name", "5. Search Tasks by Developer", "6. Display Tasks with Status Done", "7. Display Longest Task","8. Quit"};
            String choice = (String) JOptionPane.showInputDialog(null, "Welcome to EasyKanban! Choose an option:", "Main Menu",
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == null || choice.equals("8. Quit")) {
                JOptionPane.showMessageDialog(null, "Exiting the application.");
                break;
            }

            switch (choice) {
                case "1. Add Task" -> addTask();
                case "2. Show Report" -> taskManager.displayAllTasksReport();
                case "3. Search Task by Name" -> searchTaskByName();
                case "4. Delete Task by Name" -> deleteTaskByName();
                case "5. Search Tasks by Developer" -> searchTasksByDeveloper();
                case "6. Display Tasks with Status Done" -> taskManager.displayDoneTasks();
                case "7. Display Longest Task" -> taskManager.displayLongestTask();
                default -> JOptionPane.showMessageDialog(null, "Invalid option. Please choose again.");
            }
        }
    }
    
    
}
