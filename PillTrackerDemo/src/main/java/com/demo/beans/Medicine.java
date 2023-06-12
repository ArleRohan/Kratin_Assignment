package com.demo.beans;


public class Medicine 
{
	private String medicine_name;
	private String brand_name;
	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(String medicine_name, String brand_name) {
		super();
		this.medicine_name = medicine_name;
		this.brand_name = brand_name;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	@Override
	public String toString() {
		return "Medicine [medicine_name=" + medicine_name + ", brand_name=" + brand_name + "]";
	}
	
}
