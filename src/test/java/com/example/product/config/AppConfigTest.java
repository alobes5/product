package com.example.product.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppConfigTest {

    @Autowired
    AppConfig appConfig;

    @Test
    public void getAppName() {
        Assert.assertNotNull(appConfig.getAppName());
    }
}