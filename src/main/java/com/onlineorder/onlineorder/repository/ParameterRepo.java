package com.onlineorder.onlineorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineorder.onlineorder.entity.Parameter;

public interface ParameterRepo extends JpaRepository <Parameter,String> {
    
}
