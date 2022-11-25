package com.online.shop.repository;

import com.online.shop.entity.Company;
import com.online.shop.entity.Product;

import java.util.List;

public interface CompanyRepository {


    void create(Company company);

    Company getCompanyById(int companyId);

    void update(Company company);

    void delete(int companyId);

    List<Company> getCompanies();
}
