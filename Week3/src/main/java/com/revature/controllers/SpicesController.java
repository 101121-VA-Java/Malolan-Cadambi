package com.revature.controllers;

import java.util.List;
import java.util.Scanner;

import com.revature.exceptions.SpiceAlreadyExistsException;
import com.revature.models.Spices;
import com.revature.services.SpicesService;

public class SpicesController {
	
	public void addSpice(Scanner scan) {
		
		Spices spice = new Spices();		
		try {
			System.out.println("Please enter the Spice name: ");
			spice.setName(scan.nextLine());
			System.out.println("Please enter the qty in threshold: ");
			spice.setQty(scan.nextInt());
			System.out.println("Please enter the Country of Origin ");
			spice.setCountryOfOrigin(scan.nextLine());
			
			SpicesService spicesService = new SpicesService();
			
			String status = spicesService.addSpice(spice);
			
			if(null !=status && status.equals("Success")) {				
				System.out.println("Spice "+ spice.getName() + " successfully Added!");
			}
		}
		catch (SpiceAlreadyExistsException e) {
			System.out.println("Error Adding Spice:" + spice.getName());
		}
	}
	
	public void viewSpices() {
		
		SpicesService spicesService = new SpicesService();
		List<Spices> spicesList = spicesService.viewSpices();
		
		if(null !=spicesList) {
			System.out.println("Spice Details: ");
			for(Spices spice : spicesList) {
				System.out.println("Spice Name : "+ spice.getName());
				System.out.println("Spice Qty available : "+ spice.getQty());
				System.out.println("Spice Country of Origin : "+ spice.getCountryOfOrigin());	
				System.out.println("");
			}			
		}
		else {
			System.out.println("Error retreiving avaialble spices");
		}
	}
}
