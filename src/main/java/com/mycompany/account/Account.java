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
    // Variable to accumulate total hours
    
    private static double totalHours = 0;  

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
        // Initialize array with specified size

        JOptionPane.showMessageDialog(null, "WELCOME TO EasyKanban");
        int totalTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number of tasks:"));
        tasks = new Task[totalTasks];  
        
        // Menu for task management
        boolean running = true;
        while (running) {
            String menu = "Select an option:\n1. Add Task\n2. Display Tasks with Status 'Done'\n"
                    + "3. Display Task with Longest Duration\n4. Search Task by Name\n"
                    + "5. Search Tasks by Developer\n6. Delete a Task\n7. Display All Tasks\n8. Quit";
            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    TaskManager.displayTasksWithStatusDone();
                    break;
                case 3:
                    TaskManager.displayLongestTask();
                    break;
                case 4:
                    searchTaskByName();
                    break;
                case 5:
                    searchTasksByDeveloper();
                    break;
                case 6:
                    deleteTask();
                    break;
                case 7:
                    TaskManager.displayAllTasks();
                    break;
                case 8:
                    running = false;
                    JOptionPane.showMessageDialog(null, "Exiting application....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            }
        }
    }

    private static void addTask() {
        String developer = JOptionPane.showInputDialog("Enter developer's full name:");
        String taskName = JOptionPane.showInputDialog("Enter task name:");
        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration in hours:"));

        String[] statuses = {"To Do", "Doing", "Done"};
        String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status:", "Status",
                JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);

        TaskManager.addTask(developer, taskName, taskDuration, taskStatus);
        JOptionPane.showMessageDialog(null, "Task added successfully.");
    }

    private static void searchTaskByName() {
        String taskName = JOptionPane.showInputDialog("Enter task name to search:");
        TaskManager.searchTaskByName(taskName);
    }

    private static void searchTasksByDeveloper() {
        String developer = JOptionPane.showInputDialog("Enter developer's full name to search:");
        TaskManager.searchTasksByDeveloper(developer);
    }

    private static void deleteTask() {
        String taskName = JOptionPane.showInputDialog("Enter task name to delete:");
        TaskManager.deleteTask(taskName);
    

        
      

  

       
    }
}

    

  



    

 
    

       
    

    

          
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

        
        
    
    
    




