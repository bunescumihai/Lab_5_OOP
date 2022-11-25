package com.online.shop.repository.Impl;

import com.online.shop.repository.CompanyRepository;
import com.online.shop.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {
    @Override
    public void create(Company company) {

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
        return null;
    }
}
