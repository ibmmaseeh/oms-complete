package com.ibm.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.demo.OrderRepository;
import com.ibm.demo.entitiy.Order;

@Service
public class OrderService {// Spring Beans.
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	RestTemplate getTaxesTemplate;

	public String createOrder(Order order) {
		// call getTaxes

		float tax = getTaxesTemplate.getForObject("http://localhost:8080/getTaxes?price={price}", Float.class,
				order.getPrice());
		System.out.println(tax);
		order.setTax(tax);
		Order savedOrder = orderRepository.save(order);
		return savedOrder.getId();

	}

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	public Optional<Order> getOrder(String orderId) {
		return orderRepository.findById(orderId);
	}

	public void updateOrder(Order order) {
		orderRepository.save(order);

	}

	public void deleteOrder(String orderId) {
		orderRepository.deleteById(orderId);

	}

}
