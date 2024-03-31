package com.customerservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.customerservice.model.Order;
import com.customerservice.model.Product;

@FeignClient(value = "order-service", url = "localhost:8083")
public interface OrderServiceClient {
	
	@PostMapping("/orders")
	Order createOrder(@RequestBody List<Product> products);
}
