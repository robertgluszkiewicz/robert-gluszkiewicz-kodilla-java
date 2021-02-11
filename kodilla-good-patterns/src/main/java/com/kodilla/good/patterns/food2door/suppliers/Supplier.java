package com.kodilla.good.patterns.food2door.suppliers;

import java.util.Map;

public class Supplier {

    private String name;
    private Map<String, Double> products;

    public Supplier(final String name, final Map<String, Double> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Map<String, Double> getProducts() {
        return products;
    }
}
