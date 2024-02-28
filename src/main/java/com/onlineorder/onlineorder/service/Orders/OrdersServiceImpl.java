package com.onlineorder.onlineorder.service.Orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.onlineorder.entity.Order;
import com.onlineorder.onlineorder.repository.OrderRepo;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrderRepo orderRepo;


    @Override
    public List<Order> getPendingOrders() {
      return orderRepo.findByStatus(1);
    }

    @Override
    public Order getPeningOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPeningOrder'");
    }

    @Override
    public String addOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOrders'");
    }

    @Override
    public String updateOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOrders'");
    }

    
}
