package com.customer.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	int customer_id;
	String customer_name;
	String city;
	long pincode;
	int numoforders;
	
	public Customer() {
		
	}
	public Customer(int customer_id, String customer_name, String city, long pincode, int numoforders) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.city = city;
		this.pincode = pincode;
		this.numoforders = numoforders;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public int getNumoforders() {
		return numoforders;
	}
	public void setNumoforders(int numoforders) {
		this.numoforders = numoforders;
	}
	


}
