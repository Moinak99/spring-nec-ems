package com.java.model;

public class LeaveModel {

	private int id;
	private String email;
	private String name;
	private String reason;
	private long days;
	private int assignedleave;
	private int remainingleave;
	private String startdate;
	private String enddate;
	private String status;
	
	public LeaveModel() {}

	public LeaveModel(int id,String email,String name,String reason,int days,int assignedleave,int remainingleave,String startdate,String enddate,String status) {
		
		this.assignedleave=assignedleave;
		this.days=days;
		this.email=email;
		this.enddate=enddate;
		this.id=id;
		this.name=name;
		this.reason=reason;
		this.remainingleave=remainingleave;
		this.startdate=startdate;
		this.status=status;
		
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public long getDays() {
		return days;
	}

	public void setDays(long days) {
		this.days = days;
	}

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

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	
	
}
