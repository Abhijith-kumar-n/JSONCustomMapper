package com.example.jsoncustommapper.service;

import com.example.jsoncustommapper.entity.Order;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

public interface OrderService {
    //@Bean
    public void SaveDataToDB(Order order);
    public Optional<Order> findById(String orderId);
}
