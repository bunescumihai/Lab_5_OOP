package com.online.shop.repository.Impl;

import com.online.shop.entity.Product;
import com.online.shop.entity.SubCategory;
import com.online.shop.entity.entityRowMapper.ProductRowMapper;
import com.online.shop.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubCategoryRepositoryImpl implements SubCategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> getProducts(String categoryName, String subCategoryName) {
        String sql = "Select p.* from products p inner join categories c on c.category_id = p.category_id inner join subcategories s on c.category_id = s.category_id where c.name = ? and s.name = ?";
        return jdbcTemplate.query(sql, new ProductRowMapper(), categoryName, subCategoryName);
    }

    @Override
    public void create(SubCategory subCategory) {
        String sql = "Insert into subcategories values(DEFAULT, ?, ?)";
        jdbcTemplate.update(sql, subCategory.getName(), subCategory.getCategoryId());
    }

    @Override
    public boolean exists(String name) {
        String sql = "Select count(*) from subcategories where name = ?";
        if(jdbcTemplate.queryForObject(sql, Integer.class, name) == 0)
            return false;
        return true;
    }

}
