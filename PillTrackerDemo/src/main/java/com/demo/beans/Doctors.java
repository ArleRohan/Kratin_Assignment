package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctors_details")
public class Doctors 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doc_id;
	private String fname;
	private String lname;
	private String mobno;
	private String clinic_name;
	private String clinic_address;
	
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctors(int doc_id, String fname, String lname, String mobno, String clinic_name, String clinic_address) {
		super();
		this.doc_id = doc_id;
		this.fname = fname;
		this.lname = lname;
		this.mobno = mobno;
		this.clinic_name = clinic_name;
		this.clinic_address = clinic_address;
	}

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
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

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getClinic_name() {
		return clinic_name;
	}

	public void setClinic_name(String clinic_name) {
		this.clinic_name = clinic_name;
	}

	public String getClinic_address() {
		return clinic_address;
	}

	public void setClinic_address(String clinic_address) {
		this.clinic_address = clinic_address;
	}

	@Override
	public String toString() {
		return "Doctors [doc_id=" + doc_id + ", fname=" + fname + ", lname=" + lname + ", mobno=" + mobno
				+ ", clinic_name=" + clinic_name + ", clinic_address=" + clinic_address + "]";
	}
	
	
}
