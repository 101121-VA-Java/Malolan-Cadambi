package com.revature.services;

import java.util.List;

import com.revature.exceptions.SpiceAlreadyExistsException;
import com.revature.models.Spices;

public class SpicesService {
	
	public String addSpice(Spices spice) throws SpiceAlreadyExistsException {		
		//TODO : call DAO to insert Spices to DB
		return null;		
	}
	
	public List<Spices> viewSpices() {
		//TODO : call DAO to get available spices
		return null;
	}
	
	public String makeOffer(Spices spice) {
		//TODO : call DAO to request for an item
		return null;
	}
}
