package com.cts.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.DAO.VechileDAOImpl;
import com.cts.model.Vechile;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
			
		String name=req.getParameter("name");
		
		Long pNumber=Long.parseLong(req.getParameter("pNum"));
	
		String address=req.getParameter("address");
		
		String email=req.getParameter("email");
		
		Long aadharNo=Long.parseLong(req.getParameter("Aadhaar"));
		
		String vehicleNo=req.getParameter("vehicle no");
		String password=req.getParameter("pass");
		
		
		
		Vechile v =new Vechile(name, pNumber, address, email, aadharNo, vehicleNo,password);
		VechileDAOImpl vdi=new VechileDAOImpl();
		if(vdi.registerVehicle(v)==true){
			
RequestDispatcher rd= req.getRequestDispatcher("statusVehicleRegister.html");	
			rd.forward(req, res);
			
		}	}

}
