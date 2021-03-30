package com.ibm.searchorder;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchOrderRepository extends MongoRepository<Order, String> {

}
