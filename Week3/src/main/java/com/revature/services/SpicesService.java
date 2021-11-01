package com.revature.services;

import java.util.List;

import com.revature.exceptions.SpiceAlreadyExistsException;
import com.revature.models.Spices;
import com.revature.repositories.SpicesDao;

public class SpicesService {
	
	public String addSpice(Spices spice) throws SpiceAlreadyExistsException {		
		//call DAO to insert Spices to DB
		SpicesDao spicesDao = new SpicesDao();
		return spicesDao.addSpice(spice);		
	}
	
	public List<Spices> viewSpices() {
		//call DAO to get available spices
		SpicesDao spicesDao = new SpicesDao();
		return spicesDao.viewSpices();
	}
	
	public String makeOffer(Spices spice) {
		//call DAO to request for an item
		SpicesDao spicesDao = new SpicesDao();
		return spicesDao.makeOffer(spice);
	}
}
