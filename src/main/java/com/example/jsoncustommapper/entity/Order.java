package com.example.jsoncustommapper.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Order")
public class Order {
    @GeneratedValue
    private long id;
    @Id
    private String orderId;
    private Date date;
    private long totalSellingPrice;
    private long totalDiscount;
    private String status;
    private String tenantId;
    private Customer customer;
    private List<Item> items;
}
