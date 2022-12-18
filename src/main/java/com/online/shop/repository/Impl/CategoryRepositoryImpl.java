package com.online.shop.repository.Impl;

import com.online.shop.entity.Product;
import com.online.shop.entity.SubCategory;
import com.online.shop.entity.entityRowMapper.CategoryRowMapper;
import com.online.shop.entity.entityRowMapper.ProductRowMapper;
import com.online.shop.entity.entityRowMapper.SubCategoryRowMapper;
import com.online.shop.repository.CategoryRepository;
import com.online.shop.entity.Category;
import com.online.shop.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Override
    public void create(Category category) {
        String sql = "Insert into categories values(DEFAULT, ?)";
        jdbcTemplate.update(sql, category.getName());
    }

    @Override
    public List<SubCategory> getSubCategories(String name) {
        String sql = "Select sb.* from categories c inner join subcategories sb on c.category_id = sb.category_id where c.name = ?";
        return jdbcTemplate.query(sql, new SubCategoryRowMapper(), name);
    }

    @Override
    public void update(String categoryName, Category category) {
        String sql = "Update categories set name = ? where name = ?";
        jdbcTemplate.update(sql, category.getName(), categoryName);
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

    @Override
    public List<Product> getProductsByCategoryName(String name) {
        String sql = "Select p.* from categories c inner join products p on c.category_id = p.category_id where c.name = ?";
        return jdbcTemplate.query(sql, new ProductRowMapper(), name);
    }

    @Override
    public boolean exists(String name) {
        String sql = "Select count(*) from categories where name = ?";
        if(jdbcTemplate.queryForObject(sql, Integer.class, name) != 0)
            return true;
        return false;
    }
}
