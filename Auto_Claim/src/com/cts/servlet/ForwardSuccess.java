package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ForwardSuccess")
public class ForwardSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 HttpSession session=req.getSession(false);  
	       // session.setAttribute("email");  
		 PrintWriter out=res.getWriter();  
		 
		 if(session!=null){
		 
		
		
		 String name=(String)session.getAttribute("name");  
		 out.print("Hello, "+name+" Welcome to Profile");  
		 
		 RequestDispatcher rd=req.getRequestDispatcher("claimform.html");
			rd.forward(req, res);
		
		 }
		 
		 else{
			 
			 
			 out.print("Please login first you are not valid user");  
	            req.getRequestDispatcher("Login1.html").include(req, res);  
			 
		 }
	}

}
