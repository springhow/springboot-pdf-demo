package com.springhow.examples.springboot.pdfdemo.pojo;

import lombok.Data;

@Data
public class Account {
    private String name;
    private String phoneNumber;
    private String email;
    private Address address;


}
