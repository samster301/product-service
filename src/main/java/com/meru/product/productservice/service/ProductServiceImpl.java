package com.meru.product.productservice.service;

import com.meru.product.productservice.model.Product;
import com.meru.product.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findByDescription(String description) {
        return productRepository.findByProductDescription(description);
    }

    @Override
    public Product findByProductName(String name) {
        return productRepository.findByProductName(name);
    }

    @Override
    public Optional<Product> findByProductId(Long id) {
        return productRepository.findById(id);
    }

}
