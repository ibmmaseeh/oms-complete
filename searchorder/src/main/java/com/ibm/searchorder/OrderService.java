package com.ibm.searchorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	SearchOrderRepository searchorderRepository;

	public List<Order> getOrders() {
		return searchorderRepository.findAll();
	}

	public Optional<Order> getOrderbyId(String orderId) {
		return searchorderRepository.findById(orderId);
	}


}
