package com.revature.repositories;

import java.util.List;

import com.revature.exceptions.SpiceAlreadyExistsException;
import com.revature.models.Spices;

public interface SpicesDao {
	public String addSpice(Spices spice) throws SpiceAlreadyExistsException;
	
	public List<Spices> viewSpices();
	
	public String makeOffer(Spices spice);
	
	public Spices getSpicesById(int userId);
	
	public Spices getSpicesByName(String userName);
}
