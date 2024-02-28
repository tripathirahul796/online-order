package com.onlineorder.onlineorder.service.Orders;

import java.util.List;

import com.onlineorder.onlineorder.entity.Order;

public interface OrdersService {
    public List<Order> getPendingOrders();
    public Order getPeningOrder();
    public String addOrders();
    public String updateOrders();  
}
