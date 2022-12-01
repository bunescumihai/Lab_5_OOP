package com.online.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Company {
    private int company_id;
    private String name;
    private String link;
}
