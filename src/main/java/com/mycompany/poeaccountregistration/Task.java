/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeaccountregistration;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author Katlego Mohlala
 */
public class Task {
    private int taskNumber;
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;  // in hours
    private String taskStatus;
    private String taskID;
    
    public Task(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    // Getter and Setter methods
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public String getTaskID() {
        return taskID;
    }
    
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
}
