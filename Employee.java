package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Employee extends HttpServlet {
	@Override 
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		   System.out.println("okayyyy");
		   
	String myname= req.getParameter("name");
	String myemail=req.getParameter("email");
	
	System.out.println(myname);
	System.out.println(myemail);
	
	PrintWriter out=res.getWriter();
	out.print("name:-"+myname);
	out.print("email:-"+myemail);
	
	 }
	

  
   
}
