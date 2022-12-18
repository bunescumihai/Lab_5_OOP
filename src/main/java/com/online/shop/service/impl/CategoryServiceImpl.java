package com.online.shop.service.impl;

import com.online.shop.entity.Category;
import com.online.shop.entity.Product;
import com.online.shop.entity.SubCategory;
import com.online.shop.exception.AlreadyExistsException;
import com.online.shop.exception.NotFoundException;
import com.online.shop.repository.CategoryRepository;
import com.online.shop.repository.SubCategoryRepository;
import com.online.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Override
    public void create(Category category) {
        if(categoryRepository.exists(category.getName()))
            throw new AlreadyExistsException("Categorie cu name = " + category.getName() + " deja exista.");
        categoryRepository.create(category);
    }

    @Override
    public List<SubCategory> getSubCategories(String categoryName) {
        if(!categoryRepository.exists(categoryName))
            throw new NotFoundException("Categoria cu name = " + categoryName + " nu exista");

        return categoryRepository.getSubCategories(categoryName);
    }

    @Override
    public List<Product> getProductsBySubCategoryName(String categoryName, String subCategoryName) {
        if(!categoryRepository.exists(categoryName))
            throw new NotFoundException("Categorie cu name = " + categoryName + " nu exista");
        if(!subCategoryRepository.exists(subCategoryName))
            throw new NotFoundException("SubCategorie cu name = " + subCategoryName + " nu exista");

        return subCategoryRepository.getProducts(categoryName, subCategoryName);
    }

    @Override
    public void update(String categoryName, Category category) {
        if(!categoryRepository.exists(categoryName))
            throw new NotFoundException("Categorie cu name = " + categoryName + " nu exista");

        categoryRepository.update(categoryName, category);
    }

    @Override
    public void createSubCategory(SubCategory subCategory) {
        if(subCategoryRepository.exists(subCategory.getName()))
            throw new AlreadyExistsException("Subcategorie cu numele = " + subCategory.getName() + " deja exista.");
        subCategoryRepository.create(subCategory);
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }
}
