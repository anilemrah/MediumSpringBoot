package com.anilemrah.springboot.basicrestapi.entity;

public class Car {
	
	private String company;
	
	private String model;
	
	private String color;
	
	public Car(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
