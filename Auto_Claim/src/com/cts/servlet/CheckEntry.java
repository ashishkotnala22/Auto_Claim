package com.cts.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.DAO.validate;

	
@WebServlet("/CheckEntry")
public class CheckEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Email=request.getParameter("email");
		String password=request.getParameter("pass");
		if(validate.checkUser(Email, password))
			{
			RequestDispatcher rd= request.getRequestDispatcher("AlreadyRegister.html");
		    rd.forward(request, response);
			}
		else
		{
			//System.out.println("Invalid credentials");
			RequestDispatcher rd= request.getRequestDispatcher("Register");
	        rd.forward(request, response);
	}
		
		
	}

}
