package com.revature.services;

import java.util.List;

import com.revature.exceptions.SpiceAlreadyExistsException;
import com.revature.models.Spices;
import com.revature.repositories.SpicesDao;
import com.revature.repositories.SpicesDaoImpl;

public class SpicesService {
	
	private SpicesDao spicesDao = new SpicesDaoImpl();
	
	public String addSpice(Spices spice) throws SpiceAlreadyExistsException {		
		//Check if user already exists
		Spices existingSpice = spicesDao.getSpicesByName(spice.getName());
		
		if(existingSpice != null && existingSpice.getName() != null ) {
			throw new SpiceAlreadyExistsException();
		}
		//call DAO to insert user to DB
		return spicesDao.addSpice(spice);
	}
	
	public List<Spices> viewSpices() {
		//call DAO to get available spice
		return spicesDao.viewSpices();
	}
	
	public String makeOffer(Spices spice) {
		//call DAO to request for an item
		return spicesDao.makeOffer(spice);
	}
}
