package com.revature.services;

import java.util.List;

import com.revature.models.Payments;
import com.revature.models.Users;
import com.revature.repositories.UsersDao;

public class UserService {
	
	public String addUser(Users user) {		
		//call DAO to insert user to DB
		UsersDao userDao = new UsersDao();
		return userDao.addUser(user);		
	}
	
	public String loginUser( Users user) {
		//call DAO to get user info from DB to all login of user
		UsersDao userDao = new UsersDao();
		return userDao.loginUser(user);
	}
	
	public List<Payments> getEmployeePayments( String empName) {
		//Call DAO to fetch the payment history for the given employee.
		UsersDao userDao = new UsersDao();
		return userDao.getEmployeePayments(empName);
	}
}
