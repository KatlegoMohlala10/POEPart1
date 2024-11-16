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

    // Method to generate Task ID
    private String generateTaskID(String taskName, int taskNumber, String developerName) {
        String firstTwoLetters = taskName.substring(0, 2).toUpperCase();
        String lastThreeLetters = developerName.substring(developerName.length() - 3).toUpperCase();
        return firstTwoLetters + ":" + taskNumber + ":" + lastThreeLetters;
    }
    
    // Display all tasks with "Done" status
    public void displayDoneTasks() {
        StringBuilder result = new StringBuilder("Tasks with 'Done' status:\n");
        for (int i = 0; i < taskStatuses.size(); i++) {
            if ("Done".equalsIgnoreCase(taskStatuses.get(i))) {
                result.append("Developer: ").append(developerNames.get(i))
                      .append(", Task Name: ").append(taskNames.get(i))
                      .append(", Duration: ").append(taskDurations.get(i)).append(" hours\n");
            }
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
    
    // Display task with the longest duration
    public void displayLongestTask() {
        if (taskDurations.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tasks available.");
            return;
        }
        int maxDurationIndex = 0;
        for (int i = 1; i < taskDurations.size(); i++) {
            if (taskDurations.get(i) > taskDurations.get(maxDurationIndex)) {
                maxDurationIndex = i;
            }
        }
        JOptionPane.showMessageDialog(null, """
                                            Task with the longest duration:
                                            Developer: """ + developerNames.get(maxDurationIndex) +
                ", Duration: " + taskDurations.get(maxDurationIndex) + " hours");
    }
    
    
}
