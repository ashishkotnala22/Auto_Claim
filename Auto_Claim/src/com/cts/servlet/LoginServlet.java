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
import javax.servlet.http.HttpSession;

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
		String Name=request.getParameter("name");
		
		if(validate.checkUser(Email, password))
			{
			
			
			 HttpSession session=request.getSession();  
		        session.setAttribute("name",Name);  
			RequestDispatcher rd= request.getRequestDispatcher("successlogin.html");
		    rd.forward(request, response);
		   
		    
			}
		else
		{
			
			RequestDispatcher rd= request.getRequestDispatcher("unsuccessfullogin.html");
	        rd.forward(request, response);
	}
		
		
		
		
	}

}
