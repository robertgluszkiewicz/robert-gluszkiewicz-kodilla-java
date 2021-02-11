package com.kodilla.good.patterns.food2door.suppliers;

public class Product {

    private final String name;
    private final double quantity;
    private final double price;

    public Product(String name, double quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
