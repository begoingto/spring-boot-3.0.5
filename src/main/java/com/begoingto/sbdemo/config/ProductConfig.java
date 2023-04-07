package com.begoingto.sbdemo.config;

import com.begoingto.sbdemo.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProductConfig {
    @Bean
    @Primary
    public Product iphone(){
        Product product = new Product();
        product.setModel("Iphone");
        return product;
    }

    @Bean
    public Product samsung(){
        Product product = new Product();
        product.setModel("Samsung");
        return product;
    }
}
