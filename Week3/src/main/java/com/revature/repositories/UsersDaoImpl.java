package com.revature.repositories;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.Payments;
import com.revature.models.Users;
import com.revature.util.ConnectionUtil;

public class UsersDaoImpl implements UsersDao {
	
	@Override
	public String addUser(Users user) {
		// insert user details to DB
		try {
			Connection con = ConnectionUtil.getDBConnection();
			String sql = "insert into employees (name, username, password, role) values (?, ?, ?, ?) ";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user.getName());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPassword());
			if (user.isCustomer())
				ps.setString(4, "Customer");
			else if (user.isEmployee())
				ps.setString(4, "Employee");

			ResultSet rs = ps.executeQuery();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "Success";
	}

	@Override
	public List<Payments> getEmployeePayments(String empName) {
		// TODO Fetch employee payment details from DB for the emp Name
		return null;
	}

	@Override
	public Users getUserById(int userId) {
		Users user = new Users();
		try {
			Connection con = ConnectionUtil.getDBConnection();
			
			String sql = "select * from employees where userId = ? ";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, userId); // 1 refers to the first '?'	
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				user.setName(rs.getString("name"));
				user.setUsername(rs.getString("username"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public Users getUserByName(String userName) {
		Users user = new Users();
		try {
			Connection con = ConnectionUtil.getDBConnection();
			
			String sql = "select * from employees where userName = ? ";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, userName); // 1 refers to the first '?'	
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				user.setName(rs.getString("name"));
				user.setUsername(rs.getString("username"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
