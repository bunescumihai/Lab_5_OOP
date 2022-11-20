package com.online.shop.entity.entityRowMapper;

import com.online.shop.entity.SubCategory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubCategoryRowMapper implements RowMapper<SubCategory> {

    @Override
    public SubCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new SubCategory(
                rs.getInt(1),
                rs.getString(2),
                rs.getInt(3)
        );
    }
}
