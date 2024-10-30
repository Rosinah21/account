/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;
import java.util.regex.Pattern;
/**
 *
 * @author rosin
 */
public class LogIn {
     // Attributes for user details
    private String FirstName;
    private String LastName;
    private String Username;
    private String Password;

    // Method to check if the username is valid (contains underscore and is <= 5 characters)
    public boolean checkUserName(String username) {
        if (username.length() <= 5 && username.contains("_")) {
            return true;
        }
        return false;
    }

    // Method to check if the password meets complexity requirements
    public boolean checkPasswordComplexity(String password) {
        if (password.length() >= 8 
            && Pattern.compile("[A-Z]").matcher(password).find() 
            && Pattern.compile("[0-9]").matcher(password).find() 
            && Pattern.compile("[~@#!$%^&*]").matcher(password).find()) {
            return true;
        }
        return false;
    }

    // Method to register the user
    public String registerUser(String firstName, String lastName, String username, String password) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that the username contain an underscore and is not more than 5 caracters.";
        }
        if (!checkPasswordComplexity(password)) {
            return "password is not correctly formatted, please ensure that the password contain atleast 8 characters, a capital letter, a number, and special character";

        }

        // Store the user details after successful registration
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Username = username;
        this.Password = password;

        // If both conditions are met
        
        System.out.println("password and username successfully captured."); 
        return "User registered successfully.";
        
    }

    // Method to login the user 
    public boolean loginUser(String username, String password) {
        if (username.equals(Username) && password.equals(Password)) {
            return true;
        }
        return false;
    }

    // Method to return login status
    public String returnLoginStatus(boolean loginSuccessful) {
        if (loginSuccessful) {
            return "Login successful. Welcome " + FirstName + " " + LastName + " it is great to see you again";
        } else {
            return "Login failed.";
        }
    }
}


