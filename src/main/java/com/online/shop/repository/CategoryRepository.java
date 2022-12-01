package com.online.shop.repository;

import com.online.shop.entity.Category;
import com.online.shop.entity.SubCategory;

import java.util.List;

public interface CategoryRepository {


    void create(Category category);

    Category getCategoryByName(String name);

    List<SubCategory> getSubCategories(String name);

    void update(Category category);

    void delete(int categoryId);

    void createSubCategory(SubCategory subCategory);

    List<Category> getCategories();
}
