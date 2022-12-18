package com.online.shop.repository;

import com.online.shop.entity.Category;
import com.online.shop.entity.Product;
import com.online.shop.entity.SubCategory;

import java.util.List;

public interface CategoryRepository {


    void create(Category category);

    List<SubCategory> getSubCategories(String name);

    void update(String categoryName, Category category);

    void createSubCategory(SubCategory subCategory);

    List<Category> getCategories();

    List<Product> getProductsByCategoryName(String name);

    boolean exists(String name);
}
