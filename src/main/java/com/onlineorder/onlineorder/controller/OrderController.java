package com.onlineorder.onlineorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlineorder.onlineorder.entity.Order;
import com.onlineorder.onlineorder.service.Orders.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrdersService ordersService;

    @GetMapping("/add")
    public String addOrders() {
        ordersService.addOrders();
        return "Successfully added !!";
    }

    @GetMapping("/pendingOrders")
    public List<Order> getPendingOrders() {
        return ordersService.getPendingOrders();
    }

}
