package com.online.shop.repository.Impl;

import com.online.shop.repository.CategoryRepository;
import com.online.shop.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public void create(Category category) {

    }

    @Override
    public Category getCategoryById(int categoryId) {
        return null;
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(int categoryId) {

    }

    @Override
    public List<Category> getCategories() {
        return null;
    }
}
