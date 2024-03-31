package com.customerservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.customerservice.model.Bill;
import com.customerservice.model.Product;

@FeignClient(value = "bill-service", url = "localhost:8081")
public interface BillServiceClient {
	
	@PostMapping("/bills")
	List<Product> createBill(@RequestBody List<Product> products);
}
