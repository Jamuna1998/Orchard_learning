package com.customer.app.service;

import com.customer.app.entity.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer);
	public Customer updateCustomer(int customer_id,Customer customer);
	public Customer getCustomerByCity(String city);
	public Customer getCustomerByPin(long pincode);
	public Customer getCustomerByNumoforders(int numoforders);
}
