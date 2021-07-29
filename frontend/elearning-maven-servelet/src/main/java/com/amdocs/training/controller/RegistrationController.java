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

@WebServlet("/register")
public class RegistrationController extends HttpServlet{
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("userid");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String email = req.getParameter("email");
		String regDate = req.getParameter("regDate");
		String uploadphoto = req.getParameter("uploadphoto");
		
		User user = new User(id,name,password,phone,address,email,regDate,uploadphoto);
			UserDoa doa=new Impl();
			boolean adduser=doa.addUser(user);
			if(adduser==true) {
				out.println("user added successfully");
			}
			else {
				out.println("Try again");
			}
			
	}
}
