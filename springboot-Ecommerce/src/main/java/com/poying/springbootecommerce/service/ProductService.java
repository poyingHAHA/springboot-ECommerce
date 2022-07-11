package com.poying.springbootecommerce.service;

import com.poying.springbootecommerce.dto.ProductRequest;
import com.poying.springbootecommerce.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    List<Product> getProducts();
}
