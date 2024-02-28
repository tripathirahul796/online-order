package com.onlineorder.onlineorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineorder.onlineorder.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository <Customer, String> {
    
}
