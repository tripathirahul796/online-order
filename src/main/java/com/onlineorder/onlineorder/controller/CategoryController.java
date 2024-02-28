package com.onlineorder.onlineorder.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlineorder.onlineorder.entity.Category;
import com.onlineorder.onlineorder.service.Category.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/{categoryId}")
    public Category getCategory(@PathVariable int categoryId) {
        return categoryService.getCategory(categoryId);
    }

    @GetMapping("/add")
    public String addCategory(@RequestBody List<Category> category) {
        return categoryService.addCategory(category);

    }

    @GetMapping("/update/{categoryId}")
    public String updateCategory(@PathVariable int categoryId) {
        return categoryService.updateCategory(categoryId);
    }

    @GetMapping("/delete/{categoryId}")
    public String deleteCategory(@PathVariable int categoryId) {
        return categoryService.deleteCategory(categoryId);
    }

}
