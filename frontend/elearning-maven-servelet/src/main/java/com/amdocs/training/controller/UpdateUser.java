package com.amdocs.training.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.nio.file.attribute.DosFileAttributes;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.doa.UserDoa;
import com.amdocs.training.doa.doaimp.Impl;

@WebServlet("/update")
public class UpdateUser extends HttpServlet{
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		PrintWriter out = resp.getWriter();
    		String id = req.getParameter("userid");
    		String password=req.getParameter("password");
    		  UserDoa doa=new Impl();
    		  doa.updateUser(id, password);
    	    out.println("User Updated Successfully");
    		
    		
    }
}
