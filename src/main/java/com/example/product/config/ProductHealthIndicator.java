package com.example.product.config;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ProductHealthIndicator implements HealthIndicator {

    private final ProductRepository repository;

    @Autowired
    public ProductHealthIndicator(ProductRepository repository) {
        this.repository = repository;
    }

    /**
     * Custom health example
     *
     * @return
     */
    @Override
    public Health health() {
        try {
            Iterable<Product> all = repository.findAll();
            return Health.up().build();
        } catch (Exception e) {
            return Health.down(e).build();
        }
    }
}
