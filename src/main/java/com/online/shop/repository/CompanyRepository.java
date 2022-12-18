package com.online.shop.repository;

import com.online.shop.entity.Company;
import com.online.shop.entity.Product;

import java.util.List;

public interface CompanyRepository {


    void create(Company company);

    Company getCompanyByName(String companyName);

    List<Product> getCompanysProductsByName(String companyName);

    void update(Company company);

    List<Company> getCompanies();

    boolean companyExists(String name);

    boolean companyExists(int companyId);
}
