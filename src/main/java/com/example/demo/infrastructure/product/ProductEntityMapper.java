package com.example.demo.infrastructure.product;

import com.example.demo.domain.product.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {
    Product map(ProductEntity entity);

    List<Product> map(List<ProductEntity> entities);
}
