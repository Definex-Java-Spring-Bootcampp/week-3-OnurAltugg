package com.customerservice.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.customerservice.model.Customer;

@Repository
public class CustomerRepository {
	
	List<Customer> customerList = new ArrayList<>();
	
	public Customer save(Customer customer) {
		customerList.add(customer);
		return customer;
	}
	
	public List<Customer> getAll() {
		return customerList;
	}
	
	public Optional<Customer> findByEmail(String email) {
        return customerList.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

}
