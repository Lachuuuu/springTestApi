package com.example.demo.api.product;

import com.example.demo.api.product.model.ProductDto;
import com.example.demo.domain.product.model.Product;
import com.example.demo.infrastructure.product.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper {
    ProductDto map(Product entity);
    List<ProductDto> map(List<Product> entities);
    Product map(ProductDto product);
}
