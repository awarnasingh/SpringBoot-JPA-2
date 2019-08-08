package com.springboot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.domain.Customer;
import com.springboot.jpa.service.CustomerService;

@RestController
public class CustomerController {

	
	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {

		Customer customer2 = customerservice.save(customer);
		return new ResponseEntity<Customer>(customer2, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/customer")
	public ResponseEntity<Customer> update(@RequestBody Customer customer) {

		Customer customer2 = customerservice.save(customer);
		return new ResponseEntity<Customer>(customer2, HttpStatus.CREATED);
	}
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> findAll() {
		List<Customer> accList = customerservice.findAll();
		customerservice.findAll();
		return new ResponseEntity<List<Customer>>(accList, HttpStatus.OK);

	}
	@DeleteMapping("/customer/{id}")
	public void deleteById(@PathVariable Long id) {
		customerservice.deleteById(id);

	}
}
