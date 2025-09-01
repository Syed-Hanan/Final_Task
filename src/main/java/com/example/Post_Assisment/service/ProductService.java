package com.example.Post_Assisment.service;


import org.springframework.stereotype.Service;

import com.example.Post_Assisment.entity.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private List<Product> products = Arrays.asList(
            new Product(101,"RedTape","Shoes",1500),
            new Product(102,"AllenSolley","Shirts",1000),
            new Product(103,"WoodLand","Shoes",2500),
            new Product(104,"Oxemberg","Shirts",900),
            new Product(105,"Arrow","Shirts",1100),
            new Product(106,"Bata","Shoes",899),
            new Product(107,"Raymond","Blazers",3000),
            new Product(108,"ParkAvenue","Blazers",2500),
            new Product(109,"PeterEngland","Shirts",1200),
            new Product(110,"LondonBridge","Shirts",700)
    );

    public List<Product> getAllProducts() {
        return products;
    }

    public List<Product> getByTypeAndPrice(String type, double price) {
        return products.stream()
                .filter(p -> p.getProductType().equalsIgnoreCase(type) && p.getPrice() > price)
                .collect(Collectors.toList());
    }
}
