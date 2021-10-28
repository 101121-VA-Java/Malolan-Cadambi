package com.revature.models;

public class Customer {
	
String name;
	
	String username;
	
	String password;
	
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

}
