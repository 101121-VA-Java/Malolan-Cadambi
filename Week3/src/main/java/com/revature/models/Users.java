package com.revature.models;

public class Users {
	
	private String name;
	
	private String username;
	
	private String password;
	
	private boolean isEmployee;
	
	private boolean isCustomer;
	
	public void setName (String name) {		
		this.name = name;
	}
	
	public String getName () {		
		return this.name;			
	}
	
	public void setUsername (String username) {		
		this.username = username;
	}
	
	public String getUsername () {		
		return this.username;
	}
	
	public void setPassword (String password) {		
		this.password = password;
	}
	
	public String getPassword () {		
		return this.password;
	}

	public boolean isEmployee() {
		return isEmployee;
	}

	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	public boolean isCustomer() {
		return isCustomer;
	}

	public void setCustomer(boolean isCustomer) {
		this.isCustomer = isCustomer;
	}
}
	


