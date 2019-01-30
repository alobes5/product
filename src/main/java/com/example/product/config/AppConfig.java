package com.example.product.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@ConfigurationProperties("app")
@Valid
public class AppConfig {

    /**
     * Just testing some configuration.
     */
    @Pattern(regexp = "\\w+:\\w+")
    private String appName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
