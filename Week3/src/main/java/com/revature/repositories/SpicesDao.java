package com.revature.repositories;

import java.util.List;

import com.revature.exceptions.SpiceAlreadyExistsException;
import com.revature.models.Spices;

public class SpicesDao {
	public String addSpice(Spices spice) throws SpiceAlreadyExistsException {		
		//TODO : Insert new spice to DB
		return null;		
	}
	
	public List<Spices> viewSpices() {
		//TODO : Fetch all available spices from DB
		return null;
	}
	
	public String makeOffer(Spices spice) {
		//TODO : Request for an item to make offer
		return null;
	}
}
