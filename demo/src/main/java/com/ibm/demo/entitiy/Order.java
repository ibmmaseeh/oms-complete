package com.ibm.demo.entitiy;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;


public class Order {
	@NotNull
	private float tax;
	@NotNull
	@NotBlank
	private String item;
	@NotNull
	private float price;
	@Id
	private String id;
	public String getItem() {
		return item;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setItem(String item) {
		this.item= item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price<=0) {
			throw new IllegalArgumentException("Price cannot be negative");	
		}
		this.price = price;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	

	

}
