package com.springboot.jpa.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.domain.Customer;
import com.springboot.jpa.repository.CustomerRepository;
import com.springboot.jpa.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService  {
	
	
	@Autowired
	CustomerRepository repository;

	@Override
	public Customer save(Customer customer) {
		
		return repository.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		
		return repository.save(customer);
	}

	@Override
	public List<Customer> findAll() {
		
		return repository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}