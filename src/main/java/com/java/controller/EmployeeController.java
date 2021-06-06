package com.java.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.model.EmployeeModel;
import com.java.model.LeaveModel;
import com.java.service.Service;

@Controller
public class EmployeeController {
	EmployeeModel emobj = new EmployeeModel();
	LeaveModel lm = new LeaveModel();
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView RegisterNew(
			@RequestParam("name") String name,
			@RequestParam("department") String department,
			@RequestParam("age") int age,
			@RequestParam("address") String address,
			@RequestParam("contact") long contact,
			@RequestParam("gender") String gender,
			@RequestParam("salpackage") double salpackage,
			@RequestParam("designation") String designation,
			@RequestParam("email") String email,
			@RequestParam("password") String password) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
	    emobj.setAddress(address);
	    emobj.setAge(age);
	    emobj.setContact(contact);
	    emobj.setDepartment(department);
	    emobj.setDesignation(designation);
	    emobj.setEmail(email);
	    emobj.setGender(gender);
	    emobj.setName(name);
	    emobj.setPassword(password);
	    emobj.setSalpackage(salpackage);
	    emobj.setAssignedleave(10);
	    emobj.setRemainingleave(10);
		serv.RegisterNewEmployee(emobj);
		ModelAndView model = new ModelAndView("hrhome.jsp");
		model.addObject("msg", "Registration Success!");
		return model;
	}

	@RequestMapping(value = "/searchall")
	public ModelAndView GetAllEmployees() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("	applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
	    ArrayList<EmployeeModel> alist =serv.findAllEmployee();
	    System.out.println(alist);
		ModelAndView model = new ModelAndView("manageemployees.jsp");
		model.addObject("msg1",alist);
		return model;
	}

	@RequestMapping(value = "/searchbyemail", method = RequestMethod.POST)
	public ModelAndView SearchbyEmail(
			@RequestParam("email") String email) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
	    emobj.setEmail(email);
	    ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);	
	    ModelAndView model = new ModelAndView("manageemployees.jsp");
		model.addObject("msg1",alist);
		return model;
	}
	
	
	@RequestMapping("/del")
	public ModelAndView Delete(@RequestParam int _id)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class);
	    emobj.setId(_id);
	    serv.deleteEmployee(emobj);
	    ArrayList<EmployeeModel> alist =serv.findAllEmployee();
	    System.out.println(alist);
		ModelAndView model = new ModelAndView("manageemployees.jsp");
		model.addObject("msg1",alist);
		return model;
	}
	
	@RequestMapping("/updt")
	public ModelAndView Update(@RequestParam int _id)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class);
	    ArrayList<EmployeeModel> alist1=serv.findEmployeeByID(_id);
	    ModelAndView mv= new ModelAndView();
		mv.addObject("msg2",alist1);
		mv.setViewName("updateemployee.jsp");
		return mv;
	    
	}

	@RequestMapping(value = "/updatedetails", method = RequestMethod.POST)
	public ModelAndView UpdateDetails(
			@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("department") String department,
			@RequestParam("age") int age,
			@RequestParam("address") String address,
			@RequestParam("contact") long contact,
			@RequestParam("gender") String gender,
			@RequestParam("salpackage") double salpackage,
			@RequestParam("designation") String designation,
			@RequestParam("email") String email,
			@RequestParam("password") String password) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
	    emobj.setId(id);
	    emobj.setAddress(address);
	    emobj.setAge(age);
	    emobj.setContact(contact);
	    emobj.setDepartment(department);
	    emobj.setDesignation(designation);
	    emobj.setEmail(email);
	    emobj.setGender(gender);
	    emobj.setName(name);
	    emobj.setPassword(password);
	    emobj.setSalpackage(salpackage);
		serv.UpdateEmployeeDetails(emobj);
		ArrayList<EmployeeModel> alist =serv.findAllEmployee();
	    System.out.println(alist);
		ModelAndView model = new ModelAndView("manageemployees.jsp");
		//model.addObject("msg", mod.getEmail());
		model.addObject("msg1",alist);
		return model;
	}
	@RequestMapping(value = "/appraisal")
	public ModelAndView GetAllEmployeesforAppraisal() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("	applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
	    ArrayList<EmployeeModel> alist =serv.findAllEmployee();
	    System.out.println(alist);
		ModelAndView model = new ModelAndView("appraisal.jsp");
		//model.addObject("msg", mod.getEmail());
		model.addObject("msg1",alist);
		return model;
	}
	
	@RequestMapping(value = "/searchbyemailappraisal", method = RequestMethod.POST)
	public ModelAndView SearchbyEmailforAppraisal(
			@RequestParam("email") String email) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
	    emobj.setEmail(email);
	    ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);	
	    ModelAndView model = new ModelAndView("appraisal.jsp");
		//model.addObject("msg", mod.getEmail());
		model.addObject("msg1",alist);
		return model;
	}
	@RequestMapping("/appraise")
	public ModelAndView AppraisalRedirect(@RequestParam int _id)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class);
	    ArrayList<EmployeeModel> alist1=serv.findEmployeeByID(_id);
	    ModelAndView mv= new ModelAndView();
		mv.addObject("msg2",alist1);
		mv.setViewName("giveappraisal.jsp");
		return mv;
	
	}
	//updateappraisal
	@RequestMapping(value = "/updateappraisal", method = RequestMethod.POST)
	public ModelAndView UpdateAppraisal(
			@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("department") String department,
			@RequestParam("salpackage") double salpackage,
			@RequestParam("designation") String designation
			) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
	    emobj.setId(id);
	    emobj.setDepartment(department);
	    emobj.setDesignation(designation);
	    emobj.setSalpackage(salpackage);
	    
		serv.UpdateEmployeeAppraisalDetails(emobj);
		ArrayList<EmployeeModel> alist =serv.findAllEmployee();
	    System.out.println(alist);
		ModelAndView model = new ModelAndView("appraisal.jsp");
		//model.addObject("msg", mod.getEmail());
		model.addObject("msg1",alist);
		return model;
	}
	@RequestMapping(value="/reqleave")
	public ModelAndView RedirectToLeaveJsp(@RequestParam("email") String email)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
		emobj.setEmail(email);
	    ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);	
	    ModelAndView model = new ModelAndView("leave.jsp");
		model.addObject("msg1",alist);
		return model;
	}
	//"employeeleavereq"
	@RequestMapping(value = "/employeeleavereq", method = RequestMethod.POST)
	public ModelAndView EmployeeLeave(
			@RequestParam("id") int id,
			@RequestParam("email") String email,
			@RequestParam("name") String name,
			@RequestParam("totalleave") int totalleave,
			@RequestParam("leaveremaining") int leaveremaining,
			@RequestParam("startdate") String startdate,
			@RequestParam("enddate") String enddate,
			@RequestParam("reason") String reason
			) {
		try {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		    Service serv = ctx.getBean(Service.class); 
			Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(startdate);
			Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(enddate);
			long a = date12.getTime() - date1.getTime();
			long dd = TimeUnit.DAYS.convert(a, TimeUnit.MILLISECONDS);
			System.out.println(dd);
			
			if(dd<=leaveremaining && dd>=0)
			{
				lm.setAssignedleave(totalleave);
				lm.setDays(dd);
				lm.setEmail(email);
				lm.setEnddate(enddate);
				//lm.setId(id);
				lm.setName(name);
				lm.setReason(reason);
				lm.setRemainingleave(leaveremaining);
				lm.setStartdate(startdate);
				lm.setStatus("pending");
				ModelAndView model = new ModelAndView("employeehome.jsp");
				serv.LeaveReq(lm);
				emobj.setEmail(email);				
				ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);
				model.addObject("msg",alist);
				return model;	
			}
			else
			{
				ModelAndView model = new ModelAndView("employeehome.jsp");
				emobj.setEmail(email);				
				ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);
				model.addObject("msg",alist);
				return model;	
			}
			
		} catch (ParseException e) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		    Service serv = ctx.getBean(Service.class); 
		    ModelAndView model = new ModelAndView("employeehome.jsp");
			emobj.setEmail(email);				
			ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);
			model.addObject("msg",alist);
			return model;	
		}  

	}
	@RequestMapping(value="/empviewdetails")
	public ModelAndView viewEmpDetails(@RequestParam("email") String email)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
		emobj.setEmail(email);
	    ArrayList<EmployeeModel> alist = serv.SearchByEmail(emobj);	
	    ModelAndView model = new ModelAndView("empviewdetails.jsp");
		model.addObject("msg2",alist);
		return model;
	}
	//checkleave
	@RequestMapping(value="/checkleave")
	public ModelAndView CheckLeave(@RequestParam("email") String email)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
		lm.setEmail(email);
	    ArrayList<LeaveModel> alist = serv.SearchLeaveByEmail(lm);	
	    ModelAndView model = new ModelAndView("empshowleave.jsp");
		model.addObject("msg2",alist);
		return model;
	}

	@RequestMapping(value="/leaverequestview")
	public ModelAndView HrViewLeave()
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class); 
	    ArrayList<LeaveModel> alist =serv.findAllEmployeeLeave();
	    System.out.println(alist);
		ModelAndView model = new ModelAndView("hrleaveoperation.jsp");
		model.addObject("msg",alist);
		return model;

	}
	
	@RequestMapping("/reject")
	public ModelAndView RejectLeave(@RequestParam int _id)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class);
	   serv.HrRejectLeave(_id);
	   ArrayList<LeaveModel> alist =serv.findAllEmployeeLeave();
	    System.out.println(alist);
		ModelAndView model = new ModelAndView("hrleaveoperation.jsp");
		model.addObject("msg",alist);
		return model;

	}
	
	@RequestMapping("/approve")
	public ModelAndView ApproveLeave(@RequestParam int _id,@RequestParam String email)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Service serv = ctx.getBean(Service.class);
	    emobj.setId(_id);
	    lm.setId(_id);
	    
	    ArrayList<EmployeeModel> em = serv.GetleaveEmployee(emobj);
	    ArrayList<LeaveModel> llm = serv.GetleaveLeave(lm);
	    int rem = (int)(llm.get(0).getRemainingleave()-llm.get(0).getDays());

	    lm.setStatus("approved");
	    lm.setRemainingleave(rem);
	    serv.UpdateLeaveDetailsApprove(lm);
	    
	    emobj.setRemainingleave(rem);
	    emobj.setEmail(email);
	    serv.UpdateEmployeeLeaveDetails(emobj);

	    ArrayList<LeaveModel> alist =serv.findAllEmployeeLeave();
	    System.out.println(alist);
		ModelAndView model = new ModelAndView("hrleaveoperation.jsp");
		model.addObject("msg",alist);

		return model;

	}
	
}
