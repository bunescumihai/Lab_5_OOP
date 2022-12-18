package com.online.shop.repository;

import com.online.shop.entity.Product;
import com.online.shop.entity.SubCategory;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface SubCategoryRepository {

    List<Product> getProducts(String categoryName, String subCategoryName);

    void create(SubCategory subCategory);

    boolean exists(String name);
}
