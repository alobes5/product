package com.example.product;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    public List<Product> findByName(String productName) {
        return Arrays.asList(repository.findByName(productName));
    }
}
