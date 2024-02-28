package com.onlineorder.onlineorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineorder.onlineorder.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository <Product, Integer>{
    
}
