package com.ibm.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.demo.entitiy.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
