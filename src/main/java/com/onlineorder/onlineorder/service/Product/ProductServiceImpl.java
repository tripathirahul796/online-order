package com.onlineorder.onlineorder.service.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.onlineorder.entity.Product;
import com.onlineorder.onlineorder.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
       return productRepo.findAll();
    }

    @Override
    public Product getProduct(int productId) {
      return productRepo.findById(productId).get();
    }

    @Override
    public String addProducts(List<Product> products) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProducts'");
    }

    @Override
    public String updateProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public String deleteProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }

    
}
