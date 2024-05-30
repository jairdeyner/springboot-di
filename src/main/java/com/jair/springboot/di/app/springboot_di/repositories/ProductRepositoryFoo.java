package com.jair.springboot.di.app.springboot_di.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jair.springboot.di.app.springboot_di.models.Product;

@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1l, "Monitor Aus 27", 600L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(1l, "Monitor Aus 27", 600L);
    }

}
