package com.poying.springbootecommerce.service.impl;

import com.poying.springbootecommerce.dao.ProductDao;
import com.poying.springbootecommerce.dto.ProductRequest;
import com.poying.springbootecommerce.model.Product;
import com.poying.springbootecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
