package com.example.product.controller;

import com.example.product.ProductService;
import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

   private final ProductService service;

   @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    @ResponseBody
    public Iterable<Product> getProducts() {
        return service.findAll();
    }

    @GetMapping("/products/{productName}")
    @ResponseBody
    public List<Product> getProductsByName(@PathVariable String productName) {
        return service.findByName(productName);
    }
}
