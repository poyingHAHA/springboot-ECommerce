package com.poying.springbootecommerce.dto;

import com.poying.springbootecommerce.constant.ProductCategory;

public class ProductQueryParams {
    ProductCategory category;
    String searchKeyword;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }
}
