package com.kodilla.good.patterns.food2door.suppliers;

import java.util.HashSet;
import java.util.Set;

public class HealthyShop implements Supplier {

    @Override
    public String getSupplierName() {
        return "Healthy Shop";
    }

    @Override
    public Set<Product> getProducts() {
        Set<Product> healthyShopProduct = new HashSet<>();
        healthyShopProduct.add(new Product("Jarmuż", 458, 6.43));
        return  healthyShopProduct;
    }

    @Override
    public boolean process() {
        System.out.println("Order sent by BI system");
        return true;
    }
}
