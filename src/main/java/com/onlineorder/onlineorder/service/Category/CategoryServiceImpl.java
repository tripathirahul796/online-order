package com.onlineorder.onlineorder.service.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.onlineorder.entity.Category;
import com.onlineorder.onlineorder.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public Category getCategory(int categoryId) {
        return categoryRepo.findById(categoryId).get();
    }

    @Override
    public String addCategory(List<Category> category) {
        categoryRepo.saveAll(category);
        return "Added Successfully";
    }

    @Override
    public String updateCategory(int categoryId) {

        return null;
    }

    @Override
    public String deleteCategory(int categoryId) {
        categoryRepo.delete(categoryRepo.findById(categoryId).get());
        return "Successfully Deleted Category Id:- " + categoryId;
    }

}
