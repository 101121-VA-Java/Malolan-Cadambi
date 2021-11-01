package com.revature.repositories;

import java.util.List;

import com.revature.models.Payments;
import com.revature.models.Users;

public class UsersDao {

	public String addUser(Users user) {		
		//TODO : insert user details to DB
		return null;		
	}
	
	public String loginUser( Users user) {
		//TODO : Fetch user details from DB for the user name, password, emp/cust detail
		return null;
	}
	
	public List<Payments> getEmployeePayments( String empName) {
		//TODO : Fetch employee payment details from DB for the emp Name
		return null;
	}
}
