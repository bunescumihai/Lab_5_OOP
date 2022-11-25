package com.online.shop.repository;

import com.online.shop.entity.Product;
import com.online.shop.entity.SubCategory;

import java.util.List;

public interface SubCategoryRepository {

    void create(SubCategory subCategory);

    SubCategory getSubCategoryById(int subCategoryId);

    void update(SubCategory subCategory);

    void delete(int subCategoryId);

    List<SubCategory> getSubCategories();
}
