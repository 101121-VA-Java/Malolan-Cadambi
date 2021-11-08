package com.revature.repositories;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.exceptions.SpiceAlreadyExistsException;
import com.revature.models.Spices;
import com.revature.util.ConnectionUtil;

public class SpicesDaoImpl implements SpicesDao {

	@Override
	public String addSpice(Spices spice) throws SpiceAlreadyExistsException {
		// Insert new spice to DB
		try {
			Connection con = ConnectionUtil.getDBConnection();
			String sql = "insert into spices (name, qty, country_of_origin) values (?, ?, ?) ";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, spice.getName());
			ps.setInt(2, spice.getQty());
			ps.setString(3, spice.getCountryOfOrigin());

			ResultSet rs = ps.executeQuery();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "Success";
	}

	@Override
	public List<Spices> viewSpices() {
		// Fetch all available spices from DB
		List<Spices> spiceList = new ArrayList<Spices>();
		Spices spice;
		try {
			Connection con = ConnectionUtil.getDBConnection();
			
			String sql = "select * from spices ";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				spice = new Spices();
				spice.setName(rs.getString("name"));
				spice.setQty(rs.getInt("qty"));
				spice.setCountryOfOrigin(rs.getString("country_of_origin"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return spiceList;
	}

	@Override
	public String makeOffer(Spices spice) {
		// TODO Request for an item to make offer
		return null;
	}

	@Override
	public Spices getSpicesById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spices getSpicesByName(String name) {
		Spices spice = new Spices();
		try {
			Connection con = ConnectionUtil.getDBConnection();
			
			String sql = "select * from spices where name = ? ";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, name); // 1 refers to the first '?'	
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				spice.setName(rs.getString("name"));
				spice.setCountryOfOrigin(rs.getString("country_of_origin"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return spice;
	}
}
