package com.meru.product.productservice.controller;

import com.meru.product.productservice.model.Product;
import com.meru.product.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/info/{id}")
    public Optional<Product> getProductById(@PathVariable String id) {
        return productService.findByProductId(Long.parseLong(id));
    }

    @GetMapping("/info")
    public Product searchProduct(@NotBlank @RequestParam(value = "query") String query) {
        return productService.findByProductName(query);
    }

    @PostMapping("/info")
    public void saveProduct(@RequestBody Product payload) {
        productService.save(payload);
    }
}
