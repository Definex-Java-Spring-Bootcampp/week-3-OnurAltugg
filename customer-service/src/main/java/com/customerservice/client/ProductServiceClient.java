package com.customerservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.customerservice.model.Product;

@FeignClient(value = "product-service", url = "localhost:8082")
public interface ProductServiceClient {
	
	@PostMapping("/products")
	Product createProduct(@RequestBody Product product);
}
