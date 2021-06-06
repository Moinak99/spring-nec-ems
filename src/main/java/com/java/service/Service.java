package com.java.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.java.model.EmployeeModel;
import com.java.model.HrModel;
import com.java.model.LeaveModel;



public interface Service {
	
	
	
	//login validation hr
	@Select("SELECT email,password FROM hr WHERE email = #{email} AND password = #{password}")
	 public HrModel findByEmail(String email,String password);
	
	//login validation employee
	@Select("SELECT email,password FROM emsemployeeregistration WHERE email = #{email} AND password = #{password}")
	 public EmployeeModel findByEmailandpass(String email,String password);
	
	
	
	//register an employee
	@Insert("INSERT into emsemployeeregistration(name,department,age,address,contact,gender,salpackage,designation,email,password,assignedleave,remainingleave) VALUES(#{name}, #{department}, #{age}, #{address}, #{contact}, #{gender}, #{salpackage}, #{designation}, #{email}, #{password},#{assignedleave},#{remainingleave})")
	void RegisterNewEmployee(EmployeeModel emobj);
	
	//leave
	@Insert("INSERT into emsemployeeleave(name,email,assignedleave,remainingleave,days,reason,startdate,enddate,status) VALUES( #{name}, #{email}, #{assignedleave}, #{remainingleave}, #{days}, #{reason}, #{startdate}, #{enddate}, #{status})")
	void LeaveReq(LeaveModel lm);
	

	//get all employee
	@Select("select * from emsemployeeregistration")
	 public ArrayList<EmployeeModel> findAllEmployee();
	
	
	//get all employee leave 
		@Select("select * from emsemployeeleave")
		 public ArrayList<LeaveModel> findAllEmployeeLeave();
	
	//Search Employee By email
	@Select("select * from emsemployeeregistration WHERE email= #{email}")
	 public ArrayList<EmployeeModel> SearchByEmail(EmployeeModel emobj);
	
	
	//Search Employee By email leave
		@Select("select * from emsemployeeleave WHERE email= #{email}")
		 public ArrayList<LeaveModel> SearchLeaveByEmail(LeaveModel lm);
		
		
	//Search Employee By email leave
		@Select("select days,remainingleave from emsemployeeleave WHERE id= #{id}")
		public ArrayList<LeaveModel> GetleaveLeave(LeaveModel lm);
	//Search Employee By email leave
		@Select("select remainingleave from emsemployeeregistration WHERE id= #{id}")
		public ArrayList<EmployeeModel> GetleaveEmployee(EmployeeModel em);
		
		
		
		
		
	
	//Delete employee Details
	@Delete("DELETE FROM emsemployeeregistration WHERE id=#{id}")
	  void deleteEmployee(EmployeeModel pobj);
	
	//find by id
	@Select("select * from emsemployeeregistration WHERE id=#{id}")
	 public ArrayList<EmployeeModel> findEmployeeByID(int id);
	
	//update employee details
	@Update("UPDATE emsemployeeregistration SET name=#{name} , department=#{department}, age=#{age}, address=#{address}, contact=#{contact}, gender=#{gender}, salpackage=#{salpackage}, designation=#{designation}, email=#{email}, password=#{password} WHERE id=#{id}")
	  void UpdateEmployeeDetails(EmployeeModel emobj);
	
	//update appraisal
	@Update("UPDATE emsemployeeregistration SET department=#{department}, salpackage=#{salpackage}, designation=#{designation} WHERE id=#{id}")
	  void UpdateEmployeeAppraisalDetails(EmployeeModel emobj);
	
	
	//Update emptable for leave by email
	@Update("UPDATE emsemployeeregistration SET remainingleave=#{remainingleave} WHERE email=#{email}")
	void UpdateEmployeeLeaveDetails(EmployeeModel emobj);
	
	@Update("UPDATE emsemployeeleave SET remainingleave=#{remainingleave},status=#{status} WHERE id=#{id}")
	void UpdateLeaveDetailsApprove(LeaveModel lm);
	
	
	//hrupdate leave(reject)
	@Update("UPDATE emsemployeeleave SET status='rejected' WHERE id=#{id} ")
	void HrRejectLeave(int id);
	
}
