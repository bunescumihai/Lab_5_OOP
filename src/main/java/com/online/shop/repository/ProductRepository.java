package com.online.shop.repository;

import com.online.shop.entity.Product;

public interface ProductRepository {

    void create(Product product);

    Product getProductById(int productId);

    void update(int productId, Product product);

    void delete(int productId);
}
