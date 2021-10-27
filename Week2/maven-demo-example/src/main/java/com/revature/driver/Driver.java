package com.revature.driver;

import java.time.LocalDate;

import com.revature.models.ImportantTask;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImportantTask impTask = new ImportantTask();
		
		impTask.setName("Demo1");
		impTask.setDueDate(LocalDate.now());
		
		System.out.println("Task details with Due date");
		System.out.println(" Task : "+ impTask.getName());
		System.out.println(" Due date : "+ impTask.getDueDate());
		
		ImportantTask impTask1 = new ImportantTask("Demo", LocalDate.now());
		
		System.out.println("Task details with Due date");
		System.out.println(" Task : "+ impTask1.getName());
		System.out.println(" Due date : "+ impTask1.getDueDate());
	}
}
