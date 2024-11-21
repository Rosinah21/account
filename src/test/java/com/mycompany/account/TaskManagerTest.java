/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rosin
 */
public class TaskManagerTest {
    
    public TaskManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addTask method, of class TaskManager.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String developer = "Mike Smith";
        String taskName = "create login";
        int taskDuration = 5;
        String taskStatus = "To Do";
        TaskManager.addTask(developer, taskName, taskDuration, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of displayTasksWithStatusDone method, of class TaskManager.
     */
    @Test
    public void testDisplayTasksWithStatusDone() {
        System.out.println("displayTasksWithStatusDone");
        TaskManager.displayTasksWithStatusDone();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of displayLongestTask method, of class TaskManager.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        TaskManager.displayLongestTask();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of searchTaskByName method, of class TaskManager.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "";
        TaskManager.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskManager.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developer = "";
        TaskManager.searchTasksByDeveloper(developer);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of deleteTask method, of class TaskManager.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "";
        TaskManager.deleteTask(taskName);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of displayAllTasks method, of class TaskManager.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        TaskManager.displayAllTasks();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
