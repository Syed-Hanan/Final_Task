package com.example.Post_Assisment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Post_Assisment.entity.Product;
import com.example.Post_Assisment.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    // Endpoint 1: Get All Products
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    
    @GetMapping("/getByTypeAndPrice")
    public List<Product> getByTypeAndPrice(@RequestParam String type, @RequestParam double price) {
        return service.getByTypeAndPrice(type, price);
    }
}
