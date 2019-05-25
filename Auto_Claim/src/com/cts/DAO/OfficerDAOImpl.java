package com.cts.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cts.model.Officer;

public class OfficerDAOImpl implements OfficerDAO  {

	Connection con=null;
	PreparedStatement s=null;
	
	
	
	
	@Override
	public boolean registerOfficer(Officer o) {
		// TODO Auto-generated method stub
		
		
		con=DBUtil.getConnection();
		 boolean status=false;
		 
		 String name=o.getName();
		 Long mNumber=o.getMobileNumber();
		 String password=o.getPassword();
		 String email=o.getEmail();
		 long aadharNumber=o.getAadharNo();
		
		
		 String sql="insert into OFFICER(name,mobileNumber,password,email,aadhaar) values(?,?,?,?,?)";
		 
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
				 s.setString(3, password);
				 s.setString(4, email);
				 s.setLong(5, aadharNumber);
				
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
