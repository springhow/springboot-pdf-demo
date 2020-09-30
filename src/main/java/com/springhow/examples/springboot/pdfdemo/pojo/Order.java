package com.springhow.examples.springboot.pdfdemo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Integer orderId;
    private String date;
    private Account account;
    private Payment payment;
    private List<Item> items;
}
