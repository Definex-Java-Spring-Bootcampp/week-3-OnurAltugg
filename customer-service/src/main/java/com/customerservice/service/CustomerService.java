package com.customerservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.customerservice.model.Customer;
import com.customerservice.repository.CustomerRepository;
import com.customerservice.service.exc.CustomerNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
	
	private final CustomerRepository customerRepository;
	
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAll() {
		return customerRepository.getAll();
	}
	
	public Customer findByEmail(String email) {
		Optional<Customer> foundCustomer = customerRepository.findByEmail(email);

        Customer customer = foundCustomer.orElseThrow(() -> new CustomerNotFoundException("Customer not found!"));

        if (foundCustomer.isPresent()) {
        	customer = foundCustomer.get();
        }
        return customer;
	}

}
