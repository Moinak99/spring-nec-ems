package com.java.model;

public class EmployeeModel {
	
	private int id;
	private String password;
	private String email;
	
	private String name;
	private String department;
	private int age;
	private String address;
	private long contact;
	private String gender;
	private double salpackage;
	private String designation;
	private int assignedleave;
	public int getAssignedleave() {
		return assignedleave;
	}
	public void setAssignedleave(int assignedleave) {
		this.assignedleave = assignedleave;
	}
	public int getRemainingleave() {
		return remainingleave;
	}
	public void setRemainingleave(int remainingleave) {
		this.remainingleave = remainingleave;
	}
	private int remainingleave;
	
	
	public EmployeeModel()
	{}
	public EmployeeModel(String email, String password,String name,String department,int age,String address,
			long contact,String gender,double salpackage,String designation,int assignedleave,int remainingleave) {
		super();
		this.email=email;
		this.password=password;
		this.name=name;
		this.department=department;
		this.age=age;
		this.address=address;
		this.contact=contact;
		this.gender=gender;
		this.salpackage=salpackage;
		this.designation=designation;
		this.assignedleave=assignedleave;
		this.remainingleave=remainingleave;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalpackage() {
		return salpackage;
	}
	public void setSalpackage(double salpackage) {
		this.salpackage = salpackage;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
