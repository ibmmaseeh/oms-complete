package com.ibm.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugController {
	@PostMapping("/bug")
	String createBug() {
		return "success";	
	}
	@GetMapping("/bug")
		String getBug() {
		return "Order created";	
		}
	@PutMapping("/bug{id}")
	String updateBug(@PathVariable("id") int orderId) {
		System.out.println(orderId);
		return "order updated";
	}
	@DeleteMapping("/bug{id}")
	String deleteBug(@PathVariable("id")int orderId) {
		System.out.println(orderId);
		return "order deleted";
		
	}

}
