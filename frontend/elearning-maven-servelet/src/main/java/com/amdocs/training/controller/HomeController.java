package com.amdocs.training.controller;

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.org.apache.xpath.internal.operations.And;

@WebServlet("/authentication")
public class HomeController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("userid");
		String passwordString=req.getParameter("password");
		if(id.equals("100") && passwordString.equals("Talib")) {
			resp.sendRedirect("AdminPage.jsp");
		}
		else {
			out.println(id + " Try Again " + passwordString);
		}
		
	}
}


