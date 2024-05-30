package com.jair.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.jair.springboot.di.app.springboot_di.models.Product;

@Primary
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria ram", 200L),
                new Product(2L, "Memoria SSD", 150L),
                new Product(3L, "ADM Ryzen 7 6800H", 400L),
                new Product(4L, "Teclado", 50L));
    }

    @Override
    public List<Product> findAll() {
        return this.data;
    }

    @Override
    public Product findById(Long id) {
        return this.data.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }
}
