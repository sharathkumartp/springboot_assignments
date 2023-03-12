package com.sharath.ecommerce.service;

import com.sharath.ecommerce.dao.OrderRepo;
import com.sharath.ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    public String saveOrder(Order order) {
        return "save Order";
    }

    public com.sharath.ecommerce.model.Order getOder(Integer orderId) {
        if(orderRepo.findById(orderId).isPresent())
            return orderRepo.findById(orderId).get();
        else
            return null;
    }
}