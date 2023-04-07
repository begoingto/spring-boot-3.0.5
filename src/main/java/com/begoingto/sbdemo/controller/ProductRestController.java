package com.begoingto.sbdemo.controller;

import com.begoingto.sbdemo.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@AllArgsConstructor
public class ProductRestController {

    //private Product product;
    private Product product;
    //private final Product product;
    /*public ProductRestController(Product product) {
        this.product = product;
    }*/

    @Autowired
    @Qualifier("samsung")
    public void setProduct(Product product){
        this.product = product;
    }

    @GetMapping("/products") // Mapping URL or ROUTE
    Product getProduct(){
        //Product product = new Product();
//        product.setModel("Iphone 14");
        return product;
    }
}
