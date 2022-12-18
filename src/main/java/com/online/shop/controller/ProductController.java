package com.online.shop.controller;

import com.online.shop.entity.Product;
import com.online.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.create(product);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable int productId){
        return productService.getProductById(productId);
    }

    @DeleteMapping("/{productId}")
    public void deleteProductById(@PathVariable int productId){
        productService.delete(productId);
    }
}
