/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account;
import java.util.Scanner;
/**
 *
 * @author rosin
 */
public class Account {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        LogIn loginSystem = new LogIn();

        System.out.println("---------Welcome --------.");

        // Collect first name and last name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Collect username and password
        System.out.print("Enter username : ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Register user
        String registerStatus = loginSystem.registerUser(firstName, lastName, username, password);
        System.out.println(registerStatus);

        // If registration is successful, proceed with login
        if (registerStatus.equals("User registered successfully.")) {
            System.out.println("\nProceeding to login.");

            System.out.print("Enter username : ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password : ");
            String loginPassword = scanner.nextLine();

            // Try login
            boolean loginStatus = loginSystem.loginUser(loginUsername, loginPassword);
            System.out.println(loginSystem.returnLoginStatus(loginStatus));
        }
        
        
    }
    }
    




