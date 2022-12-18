package com.online.shop.service;

import com.online.shop.entity.Product;

import java.util.List;

public interface ProductService {

    void create(Product product);

    Product getProductById(int productId);

    void delete(int productId);

    List<Product> getProducts();

    List<Product> getProductsByCategoryName(String name);
}
