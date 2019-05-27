package com.cts.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.cts.model.Vechile;

public class VechileDAOImpl implements  VechileDAO// implements VechileDAO{
{

	Connection con=null;
	PreparedStatement s=null;
	
	
	
	
	@Override
	public boolean registerVehicle(Vechile veh) {
		
		con=DBUtil.getConnection();
		 boolean status=false;
		 
		 String name=veh.getName();
		 long mNumber=veh.getpNUmber();
		 String address=veh.getAddress();
		 String email=veh.getEmail();
		 long aadharNumber=veh.getAadharNo();
		 String vechicleNumber=veh.getVechileNumber();
		String password=veh.getPassword();
		 String sql="insert into Registration(name,mobilenumber,address,email,aadharnumber,vehiclenumber,password) values(?,?,?,?,?,?,?)";
		 
		 if(con!=null){
			 
			 try {
				s=con.prepareStatement(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				s.setString(1, name);
				 s.setLong(2, mNumber);
				 s.setString(3, address);
				 s.setString(4, email);
				 s.setLong(5, aadharNumber);
				 s.setString(6, vechicleNumber);
				 s.setString(7, password);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 int res=0;
			 
			try {
				res = s.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(res>0){
				 
				 status=true;
				 
			 }
			 
			 else{
				 
				 status=false;
			 }
			 
		 }
		
	return status;	
	}
	
	}


