package com.meru.product.productservice.service;

import com.meru.product.productservice.model.Product;

import java.util.Optional;

public interface ProductService {

    void save(Product product);

    Product findByDescription(String description);

    Product findByProductName(String name);

    Optional<Product> findByProductId(Long id);
}
