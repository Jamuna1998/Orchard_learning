package com.customer.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.app.entity.Customer;
import com.customer.app.exception.CustomerNotFoundException;
import com.customer.app.exception.NoCityFound;
import com.customer.app.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/create")
	public ResponseEntity<Object> createCustomer(@RequestBody Customer customer){
		customerService.createCustomer(customer);
		return new ResponseEntity<>("customer added with customer id : "+customer.getCustomer_id(),HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update/{customer_id}")
	public Customer updateCustomer(@PathVariable int customer_id,@RequestBody Customer customer) throws CustomerNotFoundException {
		try{
			if(customer.getCustomer_id()!=0)
				throw new CustomerNotFoundException();
		}
		catch(CustomerNotFoundException e) {
			e.printStackTrace();		}
		
		return customerService.updateCustomer(customer_id, customer);
			
	}
	@GetMapping("/getbycity/{city}")
	public Customer getCustomerByCity(@PathVariable String city,Customer customer) throws NoCityFound {
		try{
			if(customer.getCity()==null) {
				throw new NoCityFound();
		}
		}
			catch(NoCityFound e) {
				e.printStackTrace();
			}
			
		
		return customerService.getCustomerByCity(city);
	}
	@GetMapping("/getbypincode/{pincode}")
	public Customer getCustomerByPincode(@PathVariable long pincode) {
		return customerService.getCustomerByPin(pincode);
	}
	@GetMapping("/getbynumoforders/{numoforders}")
	public Customer getCustomerByPincode(@PathVariable int numoforders) {
		return customerService.getCustomerByPin(numoforders);
	}
}
