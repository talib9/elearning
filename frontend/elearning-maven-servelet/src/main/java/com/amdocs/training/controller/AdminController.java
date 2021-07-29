package com.amdocs.training.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.doa.UserDoa;
import com.amdocs.training.doa.doaimp.Impl;

@WebServlet("/delete")
public class AdminController extends HttpServlet{
     
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("userid");
		UserDoa doa=new Impl();
		boolean del=doa.deleteUser(id);
		if(del) {
			out.println("delete successfully");
		}
		else {
			out.println("Try again");
		}
		
	}
	
		
}



