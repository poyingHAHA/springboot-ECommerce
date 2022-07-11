package com.poying.springbootecommerce.service;

import com.poying.springbootecommerce.dto.ProductRequest;
import com.poying.springbootecommerce.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
