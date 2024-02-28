package com.onlineorder.onlineorder.service.Orders;

import java.util.List;

import com.onlineorder.onlineorder.entity.Order;

public interface OrdersService {
    public List<Order> getAllPendingOrders();
    public Order getOrder(int orderId);
    public String addOrders();
}
