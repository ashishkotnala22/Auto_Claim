package com.cts.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cts.model.Claim;

public class ClaimDAOImpl implements ClaimDAO {

	
	
	
	
	
	Connection con=null;
	PreparedStatement s=null;
	
	@Override
	public boolean addClaim(Claim c) {
		// TODO Auto-generated method stub
		
		
		String cPolicyNo=c.getPolicyNo();
		String cName=c.getInsuredName();
		String cAddress=c.getAddress();
		
		
		String cAge=c.getAge();
		String cMobileNum=c.getMobileNum();
		String cEmail=c.getEmail();
		String cRegNum=c.getRegistrationNo();

		
		
		
		
		
			
			con=DBUtil.getConnection();
			 boolean status=false;
			 
			
			 
			
			
			 String sql="insert into Claim(POLICYnUMBER,NAME,ADDRESS,MOBILENUMBER,AGE,EMAIL,REGISTRATIONNUMBER) values(?,?,?,?,?,?,?)";
			 
			 if(con!=null){
				 
				 try {
					s=con.prepareStatement(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 try {
					 s.setString(1, c.getPolicyNo());
					 s.setString(2, c.getInsuredName());
					 s.setString(3, c.getAddress());
					 s.setString(4, c.getMobileNum());
					 s.setString(5, c.getAge());
					 s.setString(6, c.getEmail());
					 s.setString(7, c.getRegistrationNo());
						
					
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
