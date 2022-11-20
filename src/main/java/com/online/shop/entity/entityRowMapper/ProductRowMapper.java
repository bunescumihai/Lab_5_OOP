package com.online.shop.entity.entityRowMapper;

import com.online.shop.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Product(
                rs.getInt(1),
                rs.getString(2),
                rs.getInt(3),
                rs.getInt(4),
                rs.getInt(5),
                rs.getFloat(6),
                rs.getString(7),
                rs.getInt(8),
                rs.getInt(9)
                );
    }

}
