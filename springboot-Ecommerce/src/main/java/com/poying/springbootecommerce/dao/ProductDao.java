package com.poying.springbootecommerce.dao;

import com.poying.springbootecommerce.dto.ProductQueryParams;
import com.poying.springbootecommerce.dto.ProductRequest;
import com.poying.springbootecommerce.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    Integer countProduct(ProductQueryParams productQueryParams);
}
