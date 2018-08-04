package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ValidateUser {

	@RequestMapping(value="/validateUser", method=RequestMethod.POST)
	String validateUser(Model model,HttpServletRequest request, HttpServletResponse response) 
	{
		String s = request.getParameter("username");
		String pass=request.getParameter("password");
		if(s.equals("sandeep") && pass.equals("hahaha")) {
			model.addAttribute("name", s);
			return "hello";
		}	
		else {
			return "error";
		}
	}	
}
