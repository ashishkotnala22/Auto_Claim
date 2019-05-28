package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ForwardToSettlement")
public class ForwardToSettlement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		 HttpSession session=request.getSession(false);  
	       // session.setAttribute("email");  
		 PrintWriter out=response.getWriter();  
		 
		 if(session!=null){
		 
		
		int value=Integer.parseInt(request.getParameter("value"));
		Double years=Double.parseDouble(request.getParameter("years"));
		
		double depreciation=value*(.1*years);
		double finalReturn=value-depreciation;
		PrintWriter pw=response.getWriter();
		pw.write("you are entitled for amount Rs. "+finalReturn);
		
		 }
		 
		 else{
			 
			 
			 
			 out.print("Please login first you are not valid user");  
	            request.getRequestDispatcher("Login.html").include(request, response);  
			 
			 
			 
		 }
		
	}

}
