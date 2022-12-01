package com.online.shop.repository.Impl;

import com.online.shop.repository.SubCategoryRepository;
import com.online.shop.entity.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubCategoryRepositoryImpl implements SubCategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(SubCategory subCategory) {
        String sql = "Insert into subcategories values(DEFAULT, ?, ?)";
        jdbcTemplate.update(sql, subCategory.getCategoryId(), subCategory.getName());
    }

    @Override
    public SubCategory getSubCategoryById(int subCategoryId) {
        return null;
    }

    @Override
    public void update(SubCategory subCategory) {

    }

    @Override
    public void delete(int categoryId) {

    }

    @Override
    public List<SubCategory> getSubCategories() {
        return null;
    }
}
