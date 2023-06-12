package com.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="disease_details")
public class Disease 
{
	private int d_id;
	private String dname;
	@OneToMany(mappedBy = "disease",fetch = FetchType.EAGER)
	private List<Doctors> doctor;
	@OneToMany
	private List<Medicine> medicine;
	public Disease() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Disease(int d_id, String dname) {
		super();
		this.d_id = d_id;
		this.dname = dname;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Doctors> getDoctor() {
		return doctor;
	}
	public void setDoctor(List<Doctors> doctor) {
		this.doctor = doctor;
	}
	public List<Medicine> getMedicine() {
		return medicine;
	}
	public void setMedicine(List<Medicine> medicine) {
		this.medicine = medicine;
	}
	@Override
	public String toString() {
		return "Disease [d_id=" + d_id + ", dname=" + dname + ", doctor=" + doctor + ", medicine=" + medicine + "]";
	}
	
	
	
}
