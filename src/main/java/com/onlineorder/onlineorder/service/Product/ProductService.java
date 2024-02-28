package com.onlineorder.onlineorder.service.Product;

import java.util.List;

import com.onlineorder.onlineorder.entity.Product;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProduct(int productId);
    public String addProducts(List<Product> products);
    public String updateProduct();
    public String deleteProduct();
}
