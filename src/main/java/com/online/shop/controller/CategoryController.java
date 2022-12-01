package com.online.shop.controller;

import com.online.shop.entity.Category;
import com.online.shop.entity.SubCategory;
import com.online.shop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getCategories(){
        return categoryRepository.getCategories();
    }

    @GetMapping("/{name}")
    public Category getSubCategories(@PathVariable String name){
        return null;
    }

    @PostMapping
    public void createCategory(@RequestBody Category category){
        categoryRepository.create(category);
    }

    @PostMapping("/createsubcategory")
    public void createSubCategory(@RequestBody SubCategory subCategory){
        categoryRepository.createSubCategory(subCategory);
    }

}
