package com.online.shop.repository;

import com.online.shop.entity.Category;

import java.util.List;

public interface CategoryRepository {


    void create(Category category);

    Category getCategoryById(int categoryId);

    void update(Category category);

    void delete(int categoryId);

    List<Category> getCategories();
}
