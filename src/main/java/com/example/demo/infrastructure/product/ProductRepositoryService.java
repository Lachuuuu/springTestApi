package com.example.demo.infrastructure.product;

import com.example.demo.domain.product.model.Product;

import java.util.List;

public interface ProductRepositoryService {
    List<Product> getAllProducts();
}
