package com.example.jsoncustommapper.Repository;

import com.example.jsoncustommapper.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {
}
