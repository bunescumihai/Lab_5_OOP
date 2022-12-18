package com.online.shop.service;

import com.online.shop.entity.Category;
import com.online.shop.entity.Product;
import com.online.shop.entity.SubCategory;

import java.util.List;

public interface CategoryService {

    void create(Category category);

    List<SubCategory> getSubCategories(String name);

    List<Product> getProductsBySubCategoryName(String categoryName, String subCategoryName);

    void update(String categoryName, Category category);

    void createSubCategory(SubCategory subCategory);

    List<Category> getCategories();
}
