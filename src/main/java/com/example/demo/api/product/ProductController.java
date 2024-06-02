package com.example.demo.api.product;

import com.example.demo.api.product.model.ProductDto;
import com.example.demo.domain.product.ProductService;
import com.example.demo.domain.product.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final ProductDtoMapper mapper;

    @GetMapping
    List<ProductDto> getAllProducts(){
        return mapper.map(productService.getAllProducts());
    }

    @PostMapping()
    void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @DeleteMapping()
    void deleteALL(){
        productService.deleteAll();
    }
}
