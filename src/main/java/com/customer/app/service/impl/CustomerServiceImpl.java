package com.customer.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.app.entity.Customer;
import com.customer.app.repository.CustomerRepository;
import com.customer.app.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer createCustomer(Customer customer) {
		
		return (Customer) customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(int customer_id, Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerByCity(String city) {
		
		return customerRepository.getByCity(city);
	}

	@Override
	public Customer getCustomerByPin(long pincode) {
		
		return customerRepository.getByPincode(pincode);
	}

	@Override
	public Customer getCustomerByNumoforders(int numoforders) {
		
		return customerRepository.getByNumoforders(numoforders);
	}

}
