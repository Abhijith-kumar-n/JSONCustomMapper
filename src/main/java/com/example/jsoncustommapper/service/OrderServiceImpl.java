package com.example.jsoncustommapper.service;

import com.example.jsoncustommapper.Repository.OrderRepository;
import com.example.jsoncustommapper.entity.Order;
import com.example.jsoncustommapper.entity.Usermappings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public final Logger logger= LoggerFactory.getLogger(OrderServiceImpl.class);
    @Override
    public void SaveDataToDB(Order order) {
        logger.debug(">> Sending Data to MONGODB collection: 'Order'");
        orderRepository.save(order);
        logger.trace("|| Saved to DataBase : JSONMapper");
    }

    @Override
    public Optional<Order> findById(String orderId) {
        logger.debug(">> Searching for user on MongoDB collection : 'Order'");
        Optional<Order> orderdata= orderRepository.findById(orderId);
        if (orderdata!=null){

            logger.debug("<< Found Order and Receving mapping document from Db");
        }
        else{
            logger.debug("|| No Order Found");
        }
        return orderdata;
    }
}
