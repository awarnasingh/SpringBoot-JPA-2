package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.domain.Customer;

public interface CustomerService {
	
	public Customer save(Customer customer);
	
	public Customer update(Customer customer);
	
	public List<Customer>findAll();
	
	public void deleteById(Long id);

}
