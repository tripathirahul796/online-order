package com.onlineorder.onlineorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineorder.onlineorder.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
    
}
