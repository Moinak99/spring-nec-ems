package com.java.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.model.EmployeeModel;
import com.java.model.HrModel;
import com.java.service.Service;



@Controller
public class LoginChecking {
	
	EmployeeModel emobj = new EmployeeModel();
	@RequestMapping(value = "/log", method = RequestMethod.POST)
	public ModelAndView LoginWithCheck(@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("choice") String choice,HttpSession session) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("	applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
		
		if(choice.equalsIgnoreCase("hr"))
		{
			
			HrModel hrmod =serv.findByEmail(email, password);
			if(hrmod == null) 
			{
				ModelAndView model = new ModelAndView("login.jsp");
				return model;
				
			}
			else {
				ModelAndView model = new ModelAndView("hrhome.jsp");
				model.addObject("msg", email);
				return model;
				
			}
	
		}
		
		else
		{
			EmployeeModel em = serv.findByEmailandpass(email, password);
			if(em == null) 
			{
				System.out.println("null ooo");
				ModelAndView model = new ModelAndView("login.jsp");
				return model;
				
			}
			else {
				ModelAndView model = new ModelAndView("employeehome.jsp");
				emobj.setEmail(email);
				ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);
				model.addObject("msg",alist);
				return model;
			}
		}
		
	}
	
	
	@RequestMapping(value = "/backhr")
	public ModelAndView HrBack(@RequestParam("email") String email) {
		
		ModelAndView model = new ModelAndView("hrhome.jsp");
		model.addObject("msg", email);
		return model;
	}
	
	@RequestMapping(value = "/backemployee")
	public ModelAndView EmployeeBack(@RequestParam("email") String email) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("	applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
		ModelAndView model = new ModelAndView("employeehome.jsp");
		emobj.setEmail(email);
		ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);
		model.addObject("msg",alist);
		return model;
	}
	
	
}
