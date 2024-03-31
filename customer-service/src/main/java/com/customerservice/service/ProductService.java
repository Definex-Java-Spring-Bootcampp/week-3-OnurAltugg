package com.customerservice.service;


import org.springframework.stereotype.Service;

import com.customerservice.client.BillServiceClient;
import com.customerservice.client.ProductServiceClient;
import com.customerservice.model.Customer;
import com.customerservice.model.Product;
import com.customerservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;
	private final ProductServiceClient productServiceClient;
	private final BillServiceClient billServiceClient;
	private final CustomerService customerService;
	
	public Product createProducts(String email, Product product) {		
		Customer customer = customerService.findByEmail(email);

		productRepository.getAll().add(product);
		billServiceClient.createBill(productRepository.getAll());
		productServiceClient.createProduct(product);
		return product;
	}
	
	
	
}
