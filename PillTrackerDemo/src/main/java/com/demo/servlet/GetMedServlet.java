package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetMedServlet
 */
public class GetMedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 try
		 {
			 /*fetch data from form*/
			 response.setContentType("text/html");
			 PrintWriter out = response.getWriter();
			 String disease = request.getParameter("disease_name");
			 String medicine = request.getParameter("medicine");
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
