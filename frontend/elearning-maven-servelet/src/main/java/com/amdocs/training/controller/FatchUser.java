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

@WebServlet("/getuser")
public class FatchUser extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("userid");
		UserDoa doa=new Impl();
		User user=doa.getUserById(id);
		
		out.println("Userid  " + user.getUserid() +"<br>");  
		out.println("name " + user.getName()+"<br>");  
		out.println("address  " + user.getAddress()+"<br>");  
		out.println("password  " + user.getPassword()+"<br>");  
		out.println("email  " + user.getEmail()+"<br>");  
		out.println("phone  " + user.getPhone()+"<br>");  
		out.println("regdate  " + user.getRegDate()+"<br>");  
		out.println("image link  " + user.getUploadImg()+"<br>");  
	}

}
