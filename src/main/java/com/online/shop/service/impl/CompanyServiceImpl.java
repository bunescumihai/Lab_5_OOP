package com.online.shop.service.impl;

import com.online.shop.entity.Company;
import com.online.shop.entity.Product;
import com.online.shop.exception.NotFoundException;
import com.online.shop.repository.CompanyRepository;
import com.online.shop.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getCompanies() {
        return companyRepository.getCompanies();
    }

    @Override
    public List<Product> getCompanysProductsByName(String companyName) {
        if(!companyRepository.companyExists(companyName))
            throw new NotFoundException("Companie cu numele \"" + companyName + "\" nu exista");

        return companyRepository.getCompanysProductsByName(companyName);
    }

    @Override
    public void create(Company company) {
        companyRepository.create(company);
    }

    @Override
    public void update(Company company) {
        if(!companyRepository.companyExists(company.getCompany_id()))
            throw new NotFoundException("Compania cu id \"" + company.getCompany_id() + "\" nu exista");

        companyRepository.update(company);
    }
}
