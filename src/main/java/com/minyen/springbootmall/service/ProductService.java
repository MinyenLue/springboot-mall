package com.minyen.springbootmall.service;

import com.minyen.springbootmall.dto.ProductRequest;
import com.minyen.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
