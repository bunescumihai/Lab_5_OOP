package com.online.shop.repository.Impl;

import com.online.shop.repository.SubCategoryRepository;
import com.online.shop.entity.SubCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubCategoryRepositoryImpl implements SubCategoryRepository {

    @Override
    public void create(SubCategory subCategory) {

    }

    @Override
    public SubCategory getSubCategoryById(int subCategoryId) {
        return null;
    }

    @Override
    public void update(SubCategory subCategory) {

    }

    @Override
    public void delete(int categoryId) {

    }

    @Override
    public List<SubCategory> getSubCategories() {
        return null;
    }
}
