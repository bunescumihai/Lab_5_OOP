package com.online.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    private int productId;
    private String name;
    private int companiId;
    private int categoryId;
    private int subcategoryId;
    private float price;
    private String color;
    private int weight; // g
    private int guarantee;
}
