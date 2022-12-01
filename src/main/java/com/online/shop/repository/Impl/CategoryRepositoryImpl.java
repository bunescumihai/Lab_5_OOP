package com.online.shop.repository.Impl;

import com.online.shop.entity.SubCategory;
import com.online.shop.entity.entityRowMapper.CategoryRowMapper;
import com.online.shop.repository.CategoryRepository;
import com.online.shop.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Category category) {
        String sql = "Insert into categories values(DEFAULT, ?)";
        jdbcTemplate.update(sql, category.getName());
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }

    @Override
    public List<SubCategory> getSubCategories(String name) {
        String sql = "Select ";
        return null;
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(int categoryId) {

    }

    @Override
    public void createSubCategory(SubCategory subCategory) {
        String sql = "Insert into subcategories values(DEFAULT, ?, ?)";
        jdbcTemplate.update(sql, subCategory.getCategoryId(), subCategory.getName());
    }

    @Override
    public List<Category> getCategories() {
        String sql = "SELECT * from categories";
        return jdbcTemplate.query(sql, new CategoryRowMapper());
    }
}
