package com.example.jsoncustommapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Item {
    private String itemId;
    private String itemPrice;
    private String itemDiscount;
    private String status;
    private String skuId;
}
