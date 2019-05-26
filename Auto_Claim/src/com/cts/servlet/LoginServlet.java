package com.cts.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.DAO.DBUtil;
import com.cts.DAO.validate;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Connection con=DBUtil.getConnection();
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Email=request.getParameter("email");
		String password=request.getParameter("pass");
		
		
		
		if(validate.checkUser(Email, password))
			{
			RequestDispatcher rd= request.getRequestDispatcher("successlogin.html");
		    rd.forward(request, response);
			}
		else
		{
			System.out.println("Invalid credentials");
			RequestDispatcher rd= request.getRequestDispatcher("unsuccessfullogin.html");
	        rd.forward(request, response);
	}
		
		
		
		
	}

}
