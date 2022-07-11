package com.poying.springbootecommerce.dao;

import com.poying.springbootecommerce.dto.ProductRequest;
import com.poying.springbootecommerce.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
