package com.revature.models;

public class Spices {
	
	private int qty;
	
	private String name;
	
	private String countryOfOrigin;

	public void setName (String name) {		
		this.name = name;
	}
	
	public String getName () {		
		return this.name;		
	}
	
	public void setQty (int qty) {		
		this.qty = qty;		
	}
	
	public int getQty () {		
		return this.qty;
	}
	
	public void setCountryOfOrigin (String countryOfOrigin) {		
		this.countryOfOrigin = countryOfOrigin;		
	}
	
	public String getCountryOfOrigin () {		
		return this.countryOfOrigin;
	}	
}
