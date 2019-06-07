package com.lgin.sai.hcw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class user {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	private String fname;
	private String lname;
	private String address;
	
	private String email;
	
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public user(String fname, String lname, String address, String email, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
