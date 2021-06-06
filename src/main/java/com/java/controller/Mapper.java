package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mapper {

	@RequestMapping(value="/login")
	public String RedirectToLoginJsp()
	{
		return "login.jsp";
	}
	
	@RequestMapping(value="/")
	public String RedirectToIndexJsp()
	{
		return "index.jsp";
	}
	
	@RequestMapping(value="/reg")
	public String RedirectToEmployeeRegistrationJsp()
	{
		return "employeereg.jsp";
	}
	
	

	@RequestMapping(value="/hrhome")
	public String RedirectToHRhome()
	{
		return "hrhome.jsp";
	}
	
	
}
