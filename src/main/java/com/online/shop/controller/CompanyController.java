package com.online.shop.controller;


import com.online.shop.entity.Company;
import com.online.shop.entity.Product;
import com.online.shop.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getCompanies(){
        return companyService.getCompanies();
    }

    @PostMapping
    public void createCompany(@RequestBody Company company){
        companyService.create(company);
    }

    @GetMapping("/{companyName}")
    public List<Product> getCompanysProductsByName(@PathVariable String companyName){
        return companyService.getCompanysProductsByName(companyName);
    }

    @PutMapping
    public void updateCompany(@RequestBody Company company){
        companyService.update(company);
    }
}
