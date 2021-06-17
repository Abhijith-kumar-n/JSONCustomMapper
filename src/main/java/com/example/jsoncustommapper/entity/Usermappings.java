package com.example.jsoncustommapper.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "mappings")
public class Usermappings {

    @Id
    private String user;
    private String orderId;
    private String date;
    private String totalSellingPrice;
    private String totalDiscount;
    private String status;
    private String tenantId;
    private String itemId;
    private String itemPrice;
    private String itemDiscount;
    private String itemStatus;
    private String skuId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String pincode;
    private String address;
}
