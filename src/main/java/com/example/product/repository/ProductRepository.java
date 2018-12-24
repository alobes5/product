package com.example.product.repository;

import com.example.product.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    Product findByName(String name);

}
