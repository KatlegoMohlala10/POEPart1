/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poeaccountregistration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Katlego Mohlala
 */
public class TaskTest {
    private Task taskManager;
    
    @BeforeEach
    public void setUp() {
        taskManager = new Task();
        // Populate the Task arrays with the test data
        taskManager.addTask("Mike Smith", "Create Login", "Secure login feature", 5, "To Do");
        taskManager.addTask("Edward Harrison", "Create Add Features", "Add features", 8, "Doing");
        taskManager.addTask("Samantha Paulson", "Create Reports", "Generate reports", 11, "Done");
        taskManager.addTask("Glenda Oberholzer", "Add Arrays", "Implement arrays", 11, "To Do");
    }
    
    @Test
    public void testDeveloperArrayPopulation() {
        // Ensure developers were added correctly
        String expectedDeveloper1 = "Mike Smith";
        String expectedDeveloper2 = "Edward Harrison";
        String expectedDeveloper3 = "Samantha Paulson";
        String expectedDeveloper4 = "Glenda Oberholzer";

        // Verify by searching for each developer
        assertDoesNotThrow(() -> taskManager.searchTasksByDeveloper(expectedDeveloper1));
        assertDoesNotThrow(() -> taskManager.searchTasksByDeveloper(expectedDeveloper2));
        assertDoesNotThrow(() -> taskManager.searchTasksByDeveloper(expectedDeveloper3));
        assertDoesNotThrow(() -> taskManager.searchTasksByDeveloper(expectedDeveloper4));
    }

    @Test
    public void testLongestTaskDeveloperAndDuration() {
        // Verify the longest task details are correctly displayed
        String expectedLongest = "Glenda Oberholzer, 11";
        taskManager.displayLongestTask();
        // This test indirectly verifies the functionality through manual observation.
    }

    @Test
    public void testSearchTaskByName() {
        // Search by task name
        String expectedTaskName = "Create Login";
        assertDoesNotThrow(() -> taskManager.searchTaskByName(expectedTaskName));
    }
    
    @Test
    public void testDeleteTaskByName() {
        // Delete a task by name and ensure it's removed
        String taskToDelete = "Create Reports";
        assertDoesNotThrow(() -> taskManager.deleteTaskByName(taskToDelete));

        // Search for the deleted task to ensure it no longer exists
        assertDoesNotThrow(() -> taskManager.searchTaskByName(taskToDelete));
    }
    
    @Test
    public void testDisplayAllTasksReport() {
        // Display the full task report
        assertDoesNotThrow(() -> taskManager.displayAllTasksReport());
    }
}
