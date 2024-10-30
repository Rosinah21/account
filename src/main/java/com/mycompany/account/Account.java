/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 *
 * @author rosin
 */
public class Account {
    
     // Array to hold tasks
   private static Task[] tasks; 
    private static int taskCount = 0; 
    private static double totalHours = 0;  // Variable to accumulate total hours

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        LogIn loginSystem = new LogIn();
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        System.out.println("---------Welcome --------.");

        // Collect first name and last name
        System.out.println("Enter your firstname: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your lastname: ");
        String lastName = scanner.nextLine();

        // Collect username and password
        System.out.println("Enter username : ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        // Register user
        String registerStatus = loginSystem.registerUser(firstName, lastName, username, password);
        System.out.println(registerStatus);

        // If registration is successful, proceed with login
        if (registerStatus.equals("User registered successfully.")) {
            System.out.println("\nProceeding to login.");

            System.out.println("Enter username : ");
            String loginUsername = scanner.nextLine();

            System.out.println("Enter password : ");
            String loginPassword = scanner.nextLine();

            // Try to login
            boolean loginStatus = loginSystem.loginUser(loginUsername, loginPassword);
            System.out.println(loginSystem.returnLoginStatus(loginStatus));
            
            
        }
        JOptionPane.showMessageDialog(null, "WELCOME TO EasyKanBan");
        int totalTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number of tasks:"));
        tasks = new Task[totalTasks];  // Initialize array with specified size

        boolean running = true;
        while (running) {
            String menu = "Select an option:\n1. Add tasks\n2. Show report\n3. Quit";
            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (choice) {
                case 1:
                    addTasks(totalTasks);
                    break;
                case 2:
                    showReport();
                    break;
                case 3:
                    running = false;
                    JOptionPane.showMessageDialog(null, "Exiting application.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            }
        }
    }

    private static void addTasks(int totalTasks) {
        if (taskCount >= totalTasks) {
            JOptionPane.showMessageDialog(null, "Cannot add more tasks. Maximum number of tasks reached.");
            return;
        }

        String taskName = JOptionPane.showInputDialog("Enter task name:");

        String taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
        if (taskDescription.length() > 50) {
            JOptionPane.showMessageDialog(null, "Description too long. Task not added.");
            return;
        }

        String developerFirstName = JOptionPane.showInputDialog("Enter developer's first name:");
        String developerLastName = JOptionPane.showInputDialog("Enter developer's last name:");
        
        double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter task duration in hours:"));
           String[] statuses = {"To Do", "Doing", "Done"};
        String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status:", "Status",
                JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);

       
        Task task = new Task(taskName, taskDescription, developerFirstName, developerLastName, taskDuration, taskStatus);

        if (task.checkTaskDescription()) {
            tasks[taskCount] = task;  // Add task to array
            totalHours += task.returnTaskDuration();  // Accumulate task duration
            taskCount++;
            JOptionPane.showMessageDialog(null, task.printTaskDetails(), "Task Details", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Task successfully added.");
        } else {
            JOptionPane.showMessageDialog(null, "Task description exceeds 50 characters. Task not added.");
        }

        // If all tasks have been entered, show total hours
        if (taskCount == totalTasks) {
            JOptionPane.showMessageDialog(null, "All tasks have been entered.\nTotal hours across all tasks: " + totalHours, "Total Hours", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void showReport() {
        JOptionPane.showMessageDialog(null, "Coming Soon", "Report", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
       
    

    

          
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

        
        
    
    
    




