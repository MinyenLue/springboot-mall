package com.minyen.springbootmall.dao;

import com.minyen.springbootmall.dto.ProductRequest;
import com.minyen.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
