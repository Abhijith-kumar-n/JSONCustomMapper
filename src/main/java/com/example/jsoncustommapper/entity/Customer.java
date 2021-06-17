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
public class Customer {

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String pincode;
    private String address;

}
