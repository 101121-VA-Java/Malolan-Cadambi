package com.revature.controllers;

import java.util.Scanner;

public class FrontController {
	
	private Scanner sc;
	private UserController uc;
	
	public FrontController() {
		sc = new Scanner(System.in);
		uc = new UserController();
	}
	
	public void run() {
		boolean run = true;
		
		while(run) {
			System.out.println("Please select an option: ");
			System.out.println("1: Register");
			System.out.println("2: Login");
			System.out.println("3: Exit");
			
			String inputValue = sc.nextLine();
			
			switch(inputValue) {
			case "1": 
				System.out.println("Would you like to register a Employee or Customer?");
				String in1 = sc.nextLine().toLowerCase();
				
				switch (in1) {
				case "employee":
					uc.registerEmployee(sc);
					break;
				case "customer":
					uc.registerCustomer(sc);
					break;
				default:
					System.out.println("Invalid input");					
				}
				
				break;
			
			case "2":
				System.out.println("Are you a Employee or Customer?");
				String in2 = sc.nextLine().toLowerCase();
				switch (in2) {
				case "employee":
					uc.loginEmployee(sc);
					break;
				case "customer":
					uc.loginCustomer(sc);
					break;
				default:
					System.out.println("Invalid input");
					break;				
				}
			
			case "3":
				run = false;
				break;
				
			default:
				System.out.println("Invalid input");
			}
		}
		sc.close();
	}

}
