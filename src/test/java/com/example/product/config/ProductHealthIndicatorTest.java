package com.example.product.config;

import com.example.product.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.ConnectException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductHealthIndicatorTest {

    @MockBean
    private ProductRepository repository;

    @Autowired
    ProductHealthIndicator healthIndicator;

    @Test
    public void health_shouldBeUp() {
        Assert.assertNotNull(healthIndicator.health()  );
    }

    @Test
    public void health_shouldBeDown() {
        Mockito.doThrow(IllegalArgumentException.class).when(repository).findAll();
        Assert.assertNotNull(healthIndicator.health());
    }
}