package com.poying.springbootecommerce.dao;

import com.poying.springbootecommerce.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
