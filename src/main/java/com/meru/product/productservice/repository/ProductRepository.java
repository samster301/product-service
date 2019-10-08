package com.meru.product.productservice.repository;

import com.meru.product.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProductDescription(String description);

    Product findByProductName(String name);
}
