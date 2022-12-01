package com.online.shop.service;

import com.online.shop.entity.Product;

import java.util.List;

public interface ProductService {

    void create(Product product);

    Product getProductById(int productId);

    void update(Product product);

    void delete(int productId);

    List<Product> getProducts();

    boolean productExists(int id);
}
