package com.example.ontap22_5.controller;

import com.example.ontap22_5.entity.Product;
import com.example.ontap22_5.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/")
@RestController
public class ProductController {
    @Autowired
    ProductRepo productRepo;
    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        return productRepo.save(product);
    }
}
