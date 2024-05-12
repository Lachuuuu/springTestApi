package com.example.demo.infrastructure.product;

import com.example.demo.domain.product.model.Product;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Transactional
@Service
public class ProductRepositoryServiceImpl implements ProductRepositoryService{
    private final ProductRepository repository;
    private final ProductEntityMapper mapper;

    @PostConstruct
    void fillDatabase(){
        if(repository.count() == 0) {
            repository.saveAll(List.of(ProductEntity.builder()
                    .name("chleb")
                    .price(1L)
                    .build(), ProductEntity.builder()
                    .name("maslo")
                    .price(5L)
                    .build()));
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return mapper.map(repository.findAll());
    }

    @Override
    public void addNewProduct(Product product) {
        repository.save(mapper.map(product));
    }
}
