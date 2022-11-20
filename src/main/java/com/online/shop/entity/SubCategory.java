package com.online.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SubCategory {
    private int subCategoryId;
    private String name;
    private int categoryId;
}
