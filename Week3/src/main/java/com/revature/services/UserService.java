package com.revature.services;

import java.util.List;

import com.revature.exceptions.UsernameAlreadyInUseException;
import com.revature.models.Payments;
import com.revature.models.Users;
import com.revature.repositories.UsersDao;
import com.revature.repositories.UsersDaoImpl;

public class UserService {
	
	private UsersDao userDao = new UsersDaoImpl();
	
	public String addUser(Users user) throws UsernameAlreadyInUseException {		
		//Check if user already exists
		Users existingUser = userDao.getUserByName(user.getUsername());
		
		if(existingUser != null && existingUser.getUsername() != null ) {
			throw new UsernameAlreadyInUseException();
		}
		//call DAO to insert user to DB
		return userDao.addUser(user);		
	}
	
	public String loginUser( Users user) {
		String status = null;
		boolean isLoginSucess = false;
		//call DAO to get user info from DB to all login of user
		Users existingUser = userDao.getUserByName(user.getUsername());
		
		if(existingUser != null && existingUser.getUsername() != null && existingUser.getUsername().equals(user.getUsername())) {
			isLoginSucess = true;
		}
		if(isLoginSucess && existingUser != null && existingUser.getName() != null && existingUser.getName().equals(user.getName())) {
			isLoginSucess = true;
		}
		if(isLoginSucess && existingUser != null && existingUser.getPassword() != null && existingUser.getPassword().equals(user.getPassword())) {
			isLoginSucess = true;
		}
		if(isLoginSucess) {
			status = "Success";
		}else {
			status = "Failed";
		}		
		return status;
	}
	
	public List<Payments> getEmployeePayments( String empName) {
		//Call DAO to fetch the payment history for the given employee.
		return userDao.getEmployeePayments(empName);
	}
}
