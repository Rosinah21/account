/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

import javax.swing.JOptionPane;

/**
 *
 * @author rosin
 */
class TaskManager {
  



    // Arrays for storing task details
    private static String[] developers = new String[100];
    private static String[] taskNames = new String[100];
    private static String[] taskIDs = new String[100];
    private static int[] taskDurations = new int[100];
    private static String[] taskStatuses = new String[100];
    private static int taskCount = 0;

    // Method to add a new task
    public static void addTask(String developer, String taskName, int taskDuration, String taskStatus) {
        if (taskCount >= 100) {
            JOptionPane.showMessageDialog(null, "Task limit reached!");
            return;
        }
        developers[taskCount] = developer;
        taskNames[taskCount] = taskName;
        taskDurations[taskCount] = taskDuration;
        taskStatuses[taskCount] = taskStatus;

        // Generate Task ID
        taskIDs[taskCount] = generateTaskID(developer, taskCount, taskName);

        taskCount++;
    }

    // Method to generate Task ID
    private static String generateTaskID(String developer, int taskNumber, String taskName) {
        String devInitials = developer.substring(0, 2).toUpperCase();
        String taskInitials = taskName.substring(0, 2).toUpperCase();
        return devInitials + ":" + taskNumber + ":" + taskInitials;
    }

    // Display tasks with the status of "Done"
    public static void displayTasksWithStatusDone() {
        StringBuilder report = new StringBuilder("Tasks with Status 'Done':\n");
        for (int i = 0; i < taskCount; i++) {
            if ("Done".equalsIgnoreCase(taskStatuses[i])) {
                report.append("Developer: ").append(developers[i])
                      .append(", Task Name: ").append(taskNames[i])
                      .append(", Duration: ").append(taskDurations[i]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, report.toString());
    }

    // Display the developer and duration of the task with the longest duration
    public static void displayLongestTask() {
        if (taskCount == 0) {
            JOptionPane.showMessageDialog(null, "No tasks available!");
            return;
        }
        int maxDuration = taskDurations[0];
        int index = 0;
        for (int i = 1; i < taskCount; i++) {
            if (taskDurations[i] > maxDuration) {
                maxDuration = taskDurations[i];
                index = i;
            }
        }
        JOptionPane.showMessageDialog(null, "Longest Task:\nDeveloper: " + developers[index]
                + "\nDuration: " + maxDuration);
    }

    // Search for a task by name
    public static void searchTaskByName(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                JOptionPane.showMessageDialog(null, "Task Found:\nTask Name: " + taskNames[i]
                        + "\nDeveloper: " + developers[i] + "\nStatus: " + taskStatuses[i]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found!");
    }

    // Search for all tasks assigned to a specific developer
    public static void searchTasksByDeveloper(String developer) {
        StringBuilder report = new StringBuilder("Tasks by Developer: " + developer + "\n");
        boolean found = false;
        for (int i = 0; i < taskCount; i++) {
            if (developers[i].equalsIgnoreCase(developer)) {
                report.append("Task Name: ").append(taskNames[i])
                      .append(", Status: ").append(taskStatuses[i]).append("\n");
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, report.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found for developer: " + developer);
        }
    }

    // Delete a task by name
    public static void deleteTask(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                // Shift all tasks after the deleted task one step left
                for (int j = i; j < taskCount - 1; j++) {
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                }
                taskCount--;
                JOptionPane.showMessageDialog(null, "Task deleted successfully!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found!");
    }

    // Display all tasks
    public static void displayAllTasks() {
        if (taskCount == 0) {
            JOptionPane.showMessageDialog(null, "No tasks available!");
            return;
        }
        StringBuilder report = new StringBuilder("All Tasks:\n");
        for (int i = 0; i < taskCount; i++) {
            report.append("Task ID: ").append(taskIDs[i])
                  .append(", Developer: ").append(developers[i])
                  .append(", Task Name: ").append(taskNames[i])
                  .append(", Duration: ").append(taskDurations[i])
                  .append(", Status: ").append(taskStatuses[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, report.toString());
    }
}
  

