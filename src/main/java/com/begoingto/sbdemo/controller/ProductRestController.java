package com.begoingto.sbdemo.controller;

import com.begoingto.sbdemo.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductRestController {
    private Product product;
    @GetMapping("/products") // Mapping URL or ROUTE
    Product getProduct(){
        //Product product = new Product();
        product.setModel("Iphone 14");
        return product;
    }
}
