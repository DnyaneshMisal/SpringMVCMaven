package com.dnyanesh.helloworld.dao;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	@NotNull(message="First Name Should not be blank")
	private String fname;
	
	@NotNull(message="Last Name Should not be blank")
	private String lname;

	@NotNull(message="Hobby Should not be blank")
	@Size(min=2,max=10,message="Hobby should be  min={min} and Max={max} long")
	private String hobby;
	
	@NotNull(message="Age Should not be blank")
	private int age;
	
	@NotNull(message="Date of Birth Should not be blank")
	@DateTimeFormat(pattern="mm/dd/yyyy")
	@Past(message="Date of Birth must be in past")
	private Date dob;
	
	@NotNull(message="Departure Date Should not be blank")
	@Past(message="Departure must be in Future")
	@DateTimeFormat(pattern="mm/dd/yyyy")
	@Future
	private Date dateOfDeparture;
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	

}
