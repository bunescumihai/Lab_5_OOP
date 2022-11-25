package com.online.shop.repository;

import com.online.shop.entity.Product;

import java.util.List;

public interface ProductRepository {

    void create(Product product);

    Product getProductById(int productId);

    void update(Product product);

    void delete(int productId);

    List<Product> getProducts();
}
