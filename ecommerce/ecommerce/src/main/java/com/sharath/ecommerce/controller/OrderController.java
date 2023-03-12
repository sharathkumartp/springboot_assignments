package com.sharath.ecommerce.controller;

import com.sharath.ecommerce.model.Order;
import com.sharath.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(value = "/order")
    public String saveAddress(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping(value = "/get-order")
    public com.sharath.ecommerce.model.Order getOrder(@RequestParam Integer oderId){
        return orderService.getOder(oderId);
    }
}