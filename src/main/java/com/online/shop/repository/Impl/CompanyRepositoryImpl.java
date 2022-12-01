package com.online.shop.repository.Impl;

import com.online.shop.entity.entityRowMapper.CompanyRowMapper;
import com.online.shop.repository.CompanyRepository;
import com.online.shop.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Company company) {
        String sql = "Insert into companies values(DEFAULT, ?, ?)";
        jdbcTemplate.update(sql, company.getName(), company.getLink());
    }

    @Override
    public Company getCompanyById(int companyId) {
        return null;
    }

    @Override
    public void update(Company company) {

    }

    @Override
    public void delete(int companyId) {

    }

    @Override
    public List<Company> getCompanies() {
        String sql = "Select * from companies";
        return jdbcTemplate.query(sql, new CompanyRowMapper());
    }
}
