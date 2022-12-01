package com.online.shop.service.impl;

import com.online.shop.entity.Product;
import com.online.shop.exception.AlreadyExistsException;
import com.online.shop.exception.NotFoundException;
import com.online.shop.repository.ProductRepository;
import com.online.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void create(Product product) {
        if(productRepository.productExists(product.getProductId()))
            throw new AlreadyExistsException("Produsul cu id = " + product.getProductId() + "deja exista");

        productRepository.create(product);
    }

    @Override
    public Product getProductById(int productId) {
        if(!productRepository.productExists(productId))
            throw new NotFoundException("Produs cu id = " + productId + " nu exista");

        return productRepository.getProductById(productId);
    }

    @Override
    public void update(Product product) {
        if(!productRepository.productExists(product.getProductId()))
            throw new NotFoundException("Produs cu id = " + product.getProductId() + " nu exista");

        productRepository.update(product);
    }

    @Override
    public void delete(int productId) {

    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public boolean productExists(int id) {
        return false;
    }


}
