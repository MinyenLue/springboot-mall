package com.minyen.springbootmall.dao;

import com.minyen.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
