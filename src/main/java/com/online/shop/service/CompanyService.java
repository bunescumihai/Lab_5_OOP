package com.online.shop.service;

import com.online.shop.entity.Company;
import com.online.shop.entity.Product;

import java.util.List;

public interface CompanyService {

    List<Company> getCompanies();

    List<Product> getCompanysProductsByName(String name);

    void create(Company company);

    void update(Company company);
}
