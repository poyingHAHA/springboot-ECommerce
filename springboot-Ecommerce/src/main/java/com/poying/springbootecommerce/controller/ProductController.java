package com.poying.springbootecommerce.controller;

import com.poying.springbootecommerce.constant.ProductCategory;
import com.poying.springbootecommerce.dto.ProductQueryParams;
import com.poying.springbootecommerce.dto.ProductRequest;
import com.poying.springbootecommerce.model.Product;
import com.poying.springbootecommerce.service.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(
            // 查詢條件
            @RequestParam(required = false) ProductCategory category, // required=false表示category是可以選的
            @RequestParam(required = false) String searchKeyword,

            // 排序 Sorting
            @RequestParam(defaultValue = "created_date") String orderBy, //一般都會把新產品放前面
            @RequestParam(defaultValue = "desc") String sort
    ){
        ProductQueryParams productQueryParams = new ProductQueryParams();
        productQueryParams.setCategory(category);
        productQueryParams.setSearchKeyword(searchKeyword);
        productQueryParams.setOrderBy(orderBy);
        productQueryParams.setSort(sort);

         List<Product> productList = productService.getProducts(productQueryParams); // 提高參數可讀性
        // List<Product> productList = productService.getProducts(category, searchKeyword);

        // 不論有無數據都回200，根據Restful API的定義
        return ResponseEntity.status(HttpStatus.OK).body(productList);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
        Product product = productService.getProductById(productId);

        if(product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest){
        Integer productId = productService.createProduct(productRequest);

        Product product = productService.getProductById(productId);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer productId,
                                                 @RequestBody @Valid ProductRequest productRequest){
        // 檢查product是否存在
        Product product = productService.getProductById(productId);

        if(product == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // 修改商品數聚
        productService.updateProduct(productId, productRequest);

        Product updatedProduct = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.OK).body(updatedProduct);
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer productId){

        productService.deleteProductById(productId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
