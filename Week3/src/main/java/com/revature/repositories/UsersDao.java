package com.revature.repositories;

import java.util.List;

import com.revature.models.Payments;
import com.revature.models.Users;

public interface UsersDao {

	public String addUser(Users user);
	
	public List<Payments> getEmployeePayments( String empName);
	
	public Users getUserById(int userId);
	
	public Users getUserByName(String userName);
}
