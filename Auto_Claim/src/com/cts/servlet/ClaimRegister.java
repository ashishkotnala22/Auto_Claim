package com.cts.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.DAO.ClaimDAOImpl;
import com.cts.model.Claim;


@WebServlet("/ClaimRegister")
public class ClaimRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
String name=req.getParameter("name");
		
		
		String cPolicyNo=req.getParameter("poNUm");
		String cName=req.getParameter("name");
		String cAddress=req.getParameter("address");
		
		
		String cAge=req.getParameter("age");
		String cMobileNum=req.getParameter("pNum");
		String cEmail=req.getParameter("email");
		String cRegNum=req.getParameter("regNum");
		
	
		Claim c=new Claim(cPolicyNo,cName,cAddress, cEmail, cRegNum, cMobileNum, cAge);
		ClaimDAOImpl cdi=new ClaimDAOImpl();
		cdi.addClaim(c);
	
		
		
		RequestDispatcher rd=req.getRequestDispatcher("claimsettle.html");
		rd.forward(req, res);
		
		
		
	}

}
