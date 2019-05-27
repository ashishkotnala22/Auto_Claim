package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ForwardToSettlement")
public class ForwardToSettlement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int value=Integer.parseInt(request.getParameter("value"));
		Double years=Double.parseDouble(request.getParameter("years"));
		
		double depreciation=value*(.1*years);
		double finalReturn=value-depreciation;
		PrintWriter pw=response.getWriter();
		pw.write("you are entitled for amount "+finalReturn);
		
		
		
	}

}
