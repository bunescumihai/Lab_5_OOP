package com.online.shop.entity.entityRowMapper;

import com.online.shop.entity.Company;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyRowMapper implements RowMapper<Company> {

    @Override
    public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Company(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3)
        );
    }

}
