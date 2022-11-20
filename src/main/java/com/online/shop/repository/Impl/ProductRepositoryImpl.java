package com.online.shop.repository.Impl;

import com.online.shop.entity.Product;
import com.online.shop.entity.entityRowMapper.ProductRowMapper;
import com.online.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Product product) {
        String sql = "Insert into products values(?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, product.getProductId(), product.getName(), product.getCompaniId(), product.getCategoryId(),
                product.getSubcategoryId(), product.getPrice(), product.getColor(), product.getWeight(), product.getGuarantee());
    }

    @Override
    public Product getProductById(int productId) {
        String sql = "Select * from products where product_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{productId}, new ProductRowMapper());
    }

    @Override
    public void update(int productId, Product product) {

    }

    @Override
    public void delete(int productId) {

    }
}
