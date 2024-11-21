/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

/**
 *
 * @author rosin
 */
public class Task {
  
     private static int taskCounter = 0;
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerFirstName;
    private String developerLastName;
    private double taskDuration;
    private String taskId;
    private String taskStatus;

    public Task(String taskName, String taskDescription, String developerFirstName, String developerLastName, double taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskCounter++;
        this.taskDescription = taskDescription;
        this.developerFirstName = developerFirstName;
        this.developerLastName = developerLastName;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskId = createTaskID();
    }

    // Method to check if the task description is valid
    
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    // Method to create and return the task ID
    public String createTaskID() {
        String firstTwoLetters = developerFirstName.substring(0, 2).toUpperCase();
        String lastThreeLetters = developerLastName.substring(0, 3).toUpperCase();
        return firstTwoLetters + ":" + taskNumber + ":" + lastThreeLetters;
    }

    // Method to return the full task details as a string
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerFirstName + " " + developerLastName + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskId + "\n" +
               "Duration: " + taskDuration + " hours\n";
    }

    // Method to return the task duration in hours
    public double returnTaskDuration() {
        return taskDuration;
}

}

     
    
    

