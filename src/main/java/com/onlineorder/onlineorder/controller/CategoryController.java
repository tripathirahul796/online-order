package com.onlineorder.onlineorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineorder.onlineorder.entity.Category;
import com.onlineorder.onlineorder.service.Category.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    CategoryService categoryService;
    public List<Category> getAllCategory()
    {
        return categoryService.getAllCategory();
    }
}
