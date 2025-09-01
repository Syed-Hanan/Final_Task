package com.example.Post_Assisment.entity;

public class Product {
    private int productId;
    private String productName;
    private String productType;
    private double price;

    public Product(int productId, String productName, String productType, double price) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getProductType() { return productType; }
    public double getPrice() { return price; }
}