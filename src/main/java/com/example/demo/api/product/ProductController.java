package com.example.demo.api.product;

import com.example.demo.api.product.model.ProductDto;
import com.example.demo.domain.product.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
