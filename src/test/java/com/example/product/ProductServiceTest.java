package com.example.product;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.util.Lists.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository repository;

    private ProductService service;

    @Before
    public void setUp() throws Exception {
        service = new ProductService(repository);
    }

    @Test
    public void findAll_returnEmpty() {
        Mockito.when(repository.findAll()).thenReturn(emptyList());
        Assert.assertFalse(service.findAll().iterator().hasNext());
    }

    @Test
    public void findByName_returnEmpty() {
        Mockito.when(repository.findByName(Mockito.anyString())).thenReturn(new Product[]{});
        Assert.assertTrue(service.findByName(Mockito.anyString()).isEmpty());
    }
}