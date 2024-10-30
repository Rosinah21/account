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
public class TaskTest {
    
    
    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        Task instance = null;
        boolean expResult = false;
        boolean result = instance.checkTaskDescription();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        Task instance = null;
        String expResult = "";
        String result = instance.createTaskID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Task instance = null;
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnTaskDuration method, of class Task.
     */
    @Test
    public void testReturnTaskDuration() {
        System.out.println("returnTaskDuration");
        Task instance = null;
        double expResult = 0.0;
        double result = instance.returnTaskDuration();
        assertEquals(expResult, result, 0);
        
    }
    
}
