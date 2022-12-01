package com.online.shop.repository.Impl;

import com.online.shop.entity.Product;
import com.online.shop.entity.entityRowMapper.ProductRowMapper;
import com.online.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Product product) {
        String sql = "INSERT into products values(DEFAULT, ?, ?, ?,?,?,?, ?, ?)";
        jdbcTemplate.update(sql, product.getName(), product.getCompanyId(), product.getCategoryId(),
                product.getSubcategoryId(), product.getPrice(), product.getColor(), product.getWeight(), product.getGuarantee());
    }

    @Override
    public Product getProductById(int productId) {
        String sql = "Select * from products where product_id = ?";
        return jdbcTemplate.queryForObject(sql, new ProductRowMapper(), productId);
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int productId) {
        String sql = "Delete from products where product_id = ?";
        jdbcTemplate.update(sql, productId);
    }

    @Override
    public List<Product> getProducts() {
        String sql = "Select * from products";
        return jdbcTemplate.query(sql, new ProductRowMapper());
    }

    @Override
    public boolean productExists(int id) {
        String sql = "Select count(*) from products where id = ?";
        if(jdbcTemplate.queryForObject(sql, Integer.class, id) != 0)
            return true;

        return false;
    }


}
