package com.online.shop.controller;

import com.online.shop.entity.Product;
import com.online.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productRepository.create(product);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable int productId){
        return productRepository.getProductById(productId);
    }
}
