package com.customerservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.model.Customer;
import com.customerservice.model.Product;
import com.customerservice.service.CustomerService;
import com.customerservice.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
	
	private final CustomerService customerService;
	private final ProductService productService;
	
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAll();
	}
	
	@PostMapping("/products/{email}")
	public Product createProtucts(@PathVariable String email, @RequestBody Product product) {
        return productService.createProducts(email, product);		
	}
}
