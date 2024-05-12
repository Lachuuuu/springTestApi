package com.example.demo.domain.product.model;

import lombok.Builder;

@Builder
public record Product(String name, Long price) {
}
