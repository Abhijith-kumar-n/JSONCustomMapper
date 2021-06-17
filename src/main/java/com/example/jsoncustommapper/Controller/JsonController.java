package com.example.jsoncustommapper.Controller;


import com.example.jsoncustommapper.entity.Order;
import com.example.jsoncustommapper.entity.Usermappings;
import com.example.jsoncustommapper.service.MappingService;
import com.example.jsoncustommapper.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @Autowired
    private MappingService mappingService;
    @Autowired
    private OrderService orderService;
    @GetMapping("/Mapping")
    public String usermap(){
        return "Work In Progress!!!";
    }
    @PostMapping("/Mapping")
    public Usermappings userMappings(@RequestBody Usermappings usermappings){
        mappingService.savemapping(usermappings);
        return usermappings;
    }

    @PostMapping("/Data")
    public Order orderdata(@RequestBody Order order){
        System.out.println(order.toString());
        orderService.SaveDataToDB(order);
        System.out.println(order.getCustomer());
        return order;
    }
}
