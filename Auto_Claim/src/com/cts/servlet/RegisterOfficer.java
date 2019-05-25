package com.cts.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.DAO.OfficerDAOImpl;

import com.cts.model.Officer;


@WebServlet("/RegisterOfficer")
public class RegisterOfficer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String name=req.getParameter("name");
       
		String email=req.getParameter("email");
		
		long pNumber=Long.parseLong(req.getParameter("pNUm"));
		
		String password=req.getParameter("password");
		long aadharNo=Long.parseLong(req.getParameter("Aadhaar"));
		
		
		
	Officer o=new Officer(name, pNumber, password, email, aadharNo);
			OfficerDAOImpl odi=new OfficerDAOImpl();
	odi.registerOfficer(o);
		
		RequestDispatcher rd=req.getRequestDispatcher("statusOfficerRegister.html");
		
	}

}
