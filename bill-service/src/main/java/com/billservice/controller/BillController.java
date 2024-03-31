package com.billservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billservice.model.Bill;
import com.billservice.model.Product;
import com.billservice.service.BillService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/bills")
@RequiredArgsConstructor
public class BillController {
	
	public final BillService billService;
	
	@GetMapping
	public List<Bill> getBills() {
		return billService.getBills();
	}
	
	@PostMapping
	public List<Product> save(@RequestBody List<Product> products) {
		return billService.save(products);
	}
}
