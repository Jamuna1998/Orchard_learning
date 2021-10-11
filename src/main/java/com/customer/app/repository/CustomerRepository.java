package com.customer.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	Customer getByCity(String city);

	Customer getByPincode(long pincode);

	Customer getByNumoforders(int numoforders);

	

}
