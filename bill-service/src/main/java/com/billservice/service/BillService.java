package com.billservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.billservice.model.Bill;
import com.billservice.model.Product;
import com.billservice.repository.BillRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BillService {
	
	public final BillRepository billRepository;
	
	public List<Product> save(List<Product> products) {
		return billRepository.save(products);
	}
	
	public List<Bill> getBills() {
		return billRepository.getBills();
	}

}
