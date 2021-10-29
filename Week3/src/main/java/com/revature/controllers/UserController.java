package com.revature.controllers;

import java.util.Scanner;

import com.revature.exceptions.UserNotFoundException;
import com.revature.exceptions.UsernameAlreadyInUseException;
import com.revature.models.Users;
import com.revature.services.UserService;

public class UserController {
	//Registering Employee
	public void registerEmployee(Scanner scan) {
		
		Users newUser = new Users();		
		try {
			newUser.setEmployee(true);
			String status = registerUser(scan, newUser);
			
			if(null !=status && status.equals("Success")) {				
				System.out.println("Employee "+ newUser.getName() + " successfully registered!");
			}
		}
		catch (UsernameAlreadyInUseException e) {
			System.out.println("Error registering Employee:" + newUser.getName());
		}
	}
	//Registering Customer
	public void registerCustomer(Scanner scan) {
		
		Users newUser = new Users();		
		try {
			newUser.setCustomer(true);
			String status = registerUser(scan, newUser);
			
			if(null !=status && status.equals("Success")) {				
				System.out.println("Customer "+ newUser.getName() + " successfully registered!");
			}
		}
		catch (UsernameAlreadyInUseException e) {
			System.out.println("Error registering Customer:" + newUser.getName());
		}
	}
	
	public String registerUser(Scanner scan, Users newUser) throws UsernameAlreadyInUseException {
		System.out.println("Please enter a username: ");
		newUser.setUsername(scan.nextLine());
		System.out.println("Please enter a password: ");
		newUser.setPassword(scan.nextLine());
		System.out.println("Please enter your name: ");
		newUser.setName(scan.nextLine());
		//Call service class to insert new record.
		UserService userService = new UserService();
		String status = userService.addUser(newUser);
		return status;		
	}
	
	//Login Employee
	public void loginEmployee(Scanner scan) {
		try {
			Users user = new Users();
			user.setEmployee(true);
			String status = loginUser(scan, user);	
			
			if(null !=status && status.equals("Success")) {				
				System.out.println("Employee Successfully logged in!");
			}
		}
		catch (UserNotFoundException e) {
			System.out.println("Incorrect Username/Password for employee. Please try again.");
		}
	}
	
	//Login Customer
	public void loginCustomer(Scanner scan) {
		try {
			
			Users user = new Users();
			user.setCustomer(true);
			String status = loginUser(scan, user);	
			
			if(null !=status && status.equals("Success")) {				
				System.out.println("Customer Successfully logged in!");
			}
		}
		catch (UserNotFoundException e) {
			System.out.println("Incorrect Username/Password for customer. Please try again.");
		}
	}
	//Login User
	public String loginUser(Scanner scan, Users user) throws UserNotFoundException{
		System.out.println("Please enter a username: ");
		user.setUsername(scan.nextLine());
		System.out.println("Please enter a password: ");
		user.setPassword(scan.nextLine());
		
		//Call service class to login to application.
		UserService userService = new UserService();
		String status = userService.loginUser(user);
		return status;
	}
}
