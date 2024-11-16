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
    
    // Method to add a task and populate arrays
    public void addTask(String developerName, String taskName, String taskDescription, int taskDuration, String taskStatus) {
        // Generate Task ID based on given format
        int taskNumber = taskIDs.size();
        String taskID = generateTaskID(taskName, taskNumber, developerName);

        // Populate arrays
        developerNames.add(developerName);
        taskNames.add(taskName);
        taskIDs.add(taskID);
        taskDurations.add(taskDuration);
        taskStatuses.add(taskStatus);

        JOptionPane.showMessageDialog(null, """
                                            Task successfully captured:
                                            Status: """ + taskStatus + "\n" +
                "Developer: " + developerName + "\n" +
                "Task Number: " + taskNumber + "\n" +
                "Task Name: " + taskName + "\n" +
                "Description: " + taskDescription + "\n" +
                "Task ID: " + taskID + "\n" +
                "Duration: " + taskDuration + " hours");
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
