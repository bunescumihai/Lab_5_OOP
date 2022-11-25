package com.online.shop.controller;

import com.online.shop.entity.Product;
import com.online.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getProducts(){
        return productRepository.getProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productRepository.create(product);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable int productId){
        return productRepository.getProductById(productId);
    }

    @PutMapping("/delete/{productId}")
    public void deleteProductById(@PathVariable int productId){
        productRepository.delete(productId);
    }

    @PutMapping("/update/")
    public void updateById(@RequestBody Product product){
        productRepository.update(product);
    }
}
