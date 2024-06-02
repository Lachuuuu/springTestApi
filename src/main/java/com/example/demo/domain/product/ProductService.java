package com.example.demo.domain.product;

import com.example.demo.domain.product.model.Product;
import com.example.demo.infrastructure.product.ProductRepositoryService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProductService {
    private final ProductRepositoryService productRepositoryService;
    public String sayHello(){
        return "Hej";
    }

    public List<Product> getAllProducts(){
        return productRepositoryService.getAllProducts();
    }

    public void addProduct(Product product){
        productRepositoryService.addNewProduct(product);
    }

    public void deleteAll(){
        productRepositoryService.deleteAll();
    }
}
