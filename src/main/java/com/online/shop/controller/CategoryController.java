package com.online.shop.controller;

import com.online.shop.entity.Category;
import com.online.shop.entity.Product;
import com.online.shop.entity.SubCategory;
import com.online.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }

    @GetMapping("/{categoryName}")
    public List<SubCategory> getSubCategories(@PathVariable String categoryName){
        return categoryService.getSubCategories(categoryName);
    }

    @GetMapping("/{categoryName}/{subCategoryName}")
    public List<Product> getProductsBySubCategory(@PathVariable String categoryName, @PathVariable String subCategoryName){
        return categoryService.getProductsBySubCategoryName(categoryName, subCategoryName);
    }
    @PostMapping
    public void createCategory(@RequestBody Category category){
        categoryService.create(category);
    }

    @PostMapping("/createsubcategory")
    public void createSubCategory(@RequestBody SubCategory subCategory){
        categoryService.createSubCategory(subCategory);
    }

    @PutMapping("/{categoryName}")
    public void update(@PathVariable String categoryName, @RequestBody Category category){
        categoryService.update(categoryName,category);
    }
}
