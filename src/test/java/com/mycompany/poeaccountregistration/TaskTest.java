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
public class TaskTest {
    
    // Test for Task Description length validation
    @Test
    public void testCheckTaskDescription() {
        Task task1 = new Task(0);
        task1.setTaskDescription("Create Login to authenticate users");
        assertTrue(task1.checkTaskDescription(), "Task successfully captured");
        
        Task task2 = new Task(1);
        task2.setTaskDescription("This task description is way too long and should fail");
        assertFalse(task2.checkTaskDescription(), "Please enter a task description of less than 50 characters");
    }

    // Test for TaskID generation
    @Test
    public void testCreateTaskID() {
        // Test case 1
        Task task1 = new Task(0);
        task1.setTaskName("Login Feature");
        task1.setDeveloperDetails("Robin Harrison");
        assertEquals("LO:0:SON", task1.createTaskID());

        // Additional test cases for TaskID generation loop
        Task task2 = new Task(1);
        task2.setTaskName("Add Task Feature");
        task2.setDeveloperDetails("Mike Smith");
        assertEquals("AD:1:ITH", task2.createTaskID());

        Task task3 = new Task(2);
        task3.setTaskName("Create Task");
        task3.setDeveloperDetails("John Doe");
        assertEquals("CR:2:DOE", task3.createTaskID());

        Task task4 = new Task(3);
        task4.setTaskName("Finish Feature");
        task4.setDeveloperDetails("Samantha Kane");
        assertEquals("FI:3:ANE", task4.createTaskID());
    }

    // Test for Total Hours calculation across multiple tasks
    @Test
    public void testTotalHours() {
        Task task1 = new Task(0);
        task1.setTaskDuration(8);

        Task task2 = new Task(1);
        task2.setTaskDuration(10);

        // Assert for total hours accumulated in loop
        int totalHours = task1.returnTotalHours() + task2.returnTotalHours();
        assertEquals(18, totalHours);

        // Additional data accumulation
        Task task3 = new Task(2);
        task3.setTaskDuration(35);
        
        Task task4 = new Task(3);
        task4.setTaskDuration(36);

        totalHours += task3.returnTotalHours() + task4.returnTotalHours();
        assertEquals(89, totalHours);  // 18 (previous) + 35 + 36
    }
}
