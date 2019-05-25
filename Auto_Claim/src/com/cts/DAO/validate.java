package com.cts.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cts.DAO.DBUtil;

public class validate {
	public static boolean checkUser(String email,String pass) 
    {
     boolean st =false;
     try{
	 
        Connection con= DBUtil.getConnection();
        String sql="select Email,Password from Registration";
        PreparedStatement ps =con.prepareStatement(sql);
       // ps.setString(1, email);
       //ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        while (rs.next()) {
        	
        	String str1 = rs.getString("Email");
        	String str2 = rs.getString("Password");
        	
        	if(email.equals(str1) && str2.equals(pass)){
        		st= true;
        		
        	}
        
        	
        }
        
        
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return st;                 
 }   
	
}
