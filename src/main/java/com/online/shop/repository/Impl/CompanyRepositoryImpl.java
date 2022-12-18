package com.online.shop.repository.Impl;

import com.online.shop.entity.Product;
import com.online.shop.entity.entityRowMapper.CompanyRowMapper;
import com.online.shop.entity.entityRowMapper.ProductRowMapper;
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
    public Company getCompanyByName(String companyName) {
        String sql = "Select * from companies where name = ?";
        return jdbcTemplate.queryForObject(sql, new CompanyRowMapper(), companyName);
    }

    @Override
    public List<Product> getCompanysProductsByName(String companyName) {
        String sql = "Select p.* from products p inner join companies c on p.company_id = c.company_id where c.name = ?";
        return jdbcTemplate.query(sql, new ProductRowMapper(), companyName);
    }

    @Override
    public void update(Company company) {
        String sql = "UPDATE companies set name = ?, link = ? where company_id = ?";
        jdbcTemplate.update(sql, company.getName(), company.getLink(), company.getCompany_id());
    }

    @Override
    public List<Company> getCompanies() {
        String sql = "Select * from companies";
        return jdbcTemplate.query(sql, new CompanyRowMapper());
    }

    @Override
    public boolean companyExists(String name){
        String sql = "Select count(*) from companies where name = ?";
        if(jdbcTemplate.queryForObject(sql, Integer.class, name) == 0)
            return false;
        return true;
    }

    @Override
    public boolean companyExists(int companyId) {
        String sql = "Select count(*) from companies where company_id = ?";
        if(jdbcTemplate.queryForObject(sql, Integer.class, companyId) == 0)
            return false;
        return true;
    }
}
