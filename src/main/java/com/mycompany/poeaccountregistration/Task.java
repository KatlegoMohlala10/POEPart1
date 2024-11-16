/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeaccountregistration;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author Katlego Mohlala
 */
public class Task {
    // Arrays to store task data
    private final ArrayList<String> developerNames = new ArrayList<>();
    private final ArrayList<String> taskNames = new ArrayList<>();
    private final ArrayList<String> taskIDs = new ArrayList<>();
    private final ArrayList<Integer> taskDurations = new ArrayList<>();
    private final ArrayList<String> taskStatuses = new ArrayList<>();
    
    // New method to capture multiple tasks
    public void captureMultipleTasks(int numberOfTasks) {
        for (int i = 0; i < numberOfTasks; i++) {
            JOptionPane.showMessageDialog(null, "Entering details for Task " + (i + 1));
            captureTaskFromJOptionPane(i + 1); // Capture task details for each task
        }
    }
    
    // Method to capture task details from JOptionPane
    public void captureTaskFromJOptionPane(int taskNum) {
        taskName = JOptionPane.showInputDialog("Enter Task Name for Task " + taskNum + ":");
        taskDescription = JOptionPane.showInputDialog("Enter Task Description (must be less than 50 characters) for Task " + taskNum + ":");

        while (!checkTaskDescription()) {
            taskDescription = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters for Task " + taskNum + ":");
        }

        developerDetails = JOptionPane.showInputDialog("Enter Developer Details (First and Last Name) for Task " + taskNum + ":");
        
        String taskDurationStr = JOptionPane.showInputDialog("Enter Task Duration (hours) for Task " + taskNum + ":");
        taskDuration = Integer.parseInt(taskDurationStr);

        String[] statuses = {"To Do", "Doing", "Done"};
        taskStatus = (String) JOptionPane.showInputDialog(
                null,
                "Select Task Status for Task " + taskNum + ":",
                "Task Status",
                JOptionPane.QUESTION_MESSAGE,
                null,
                statuses,
                statuses[0]
        );

        // Generate TaskID
        createTaskID();

        // Show task details using JOptionPane
        printTaskDetails();
    }
    
    // New method to capture task details from the user
    public void captureTask(Scanner scanner) {
        System.out.println("Enter Task Name: ");
        taskName = scanner.nextLine();
        
        System.out.println("Enter Task Description (must be less than 50 characters): ");
        taskDescription = scanner.nextLine();
        while (!checkTaskDescription()) {
            System.out.println("Please enter a task description of less than 50 characters.");
            taskDescription = scanner.nextLine();
        }

        System.out.println("Enter Developer Details (First and Last Name): ");
        developerDetails = scanner.nextLine();

        System.out.println("Enter Task Duration (hours): ");
        taskDuration = scanner.nextInt();
        scanner.nextLine();  // Clear the buffer

        System.out.println("Select Task Status (To Do, Doing, Done): ");
        taskStatus = scanner.nextLine();

        // Generate the TaskID based on the input
        createTaskID();
    }
    
    // Method to capture task details from JOptionPane
    public void captureTaskFromJOptionPane() {
        taskName = JOptionPane.showInputDialog("Enter Task Name:");
        taskDescription = JOptionPane.showInputDialog("Enter Task Description (must be less than 50 characters):");

        while (!checkTaskDescription()) {
            taskDescription = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters.");
        }

        developerDetails = JOptionPane.showInputDialog("Enter Developer Details (First and Last Name):");
        
        String taskDurationStr = JOptionPane.showInputDialog("Enter Task Duration (hours):");
        taskDuration = Integer.parseInt(taskDurationStr);

        String[] statuses = {"To Do", "Doing", "Done"};
        taskStatus = (String) JOptionPane.showInputDialog(
                null,
                "Select Task Status:",
                "Task Status",
                JOptionPane.QUESTION_MESSAGE,
                null,
                statuses,
                statuses[0]
        );

        // Generate TaskID
        createTaskID();

        // Show task details using JOptionPane
        printTaskDetails();
    }
    
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
        String taskNamePart = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String developerPart = developerDetails.length() >= 3 ? developerDetails.substring(developerDetails.length() - 3).toUpperCase() : developerDetails.toUpperCase();
        this.taskID = taskNamePart + ":" + taskNumber + ":" + developerPart;
        return taskID;
    }

    public void printTaskDetails() {
        String taskDetails = "Task Status: " + taskStatus + "\n" +
                             "Developer Details: " + developerDetails + "\n" +
                             "Task Number: " + taskNumber + "\n" +
                             "Task Name: " + taskName + "\n" +
                             "Task Description: " + taskDescription + "\n" +
                             "Task ID: " + taskID + "\n" +
                             "Task Duration: " + taskDuration + " hours";

        JOptionPane.showMessageDialog(null, taskDetails, "Task Details", JOptionPane.INFORMATION_MESSAGE);
    }
    // Method to return the total hours for the task
    public int returnTotalHours() {
        return taskDuration;
    }
}
