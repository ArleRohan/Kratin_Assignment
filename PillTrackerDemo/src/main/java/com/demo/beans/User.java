package com.demo.beans;

import java.util.List;

import javax.persistence.*;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String user_fname;
	private String user_lname;
	private String address;
	private String mobno;
	@OneToMany(mappedBy = "user" )
	private List<Disease> disease;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String user_fname, String user_lname, String address, String mobno) {
		super();
		this.user_id = user_id;
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.address = address;
		this.mobno = mobno;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String email_id) {
		this.mobno = email_id;
	}
	
	public List<Disease> getDisease() {
		return disease;
	}
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_fname=" + user_fname + ", user_lname=" + user_lname + ", address="
				+ address + ", mobno=" + mobno + ", disease=" + disease + "]";
	}

}
