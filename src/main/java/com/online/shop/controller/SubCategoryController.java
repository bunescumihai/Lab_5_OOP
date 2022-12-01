package com.online.shop.controller;

import com.online.shop.entity.SubCategory;
import com.online.shop.repository.CompanyRepository;
import com.online.shop.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/subcategories")
public class SubCategoryController {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @PostMapping
    public void createSubCategory(@RequestBody SubCategory subCategory){
        subCategoryRepository.create(subCategory);
    }
}
