package com.kodilla.good.patterns.food2door.suppliers.shops;

import java.util.HashSet;
import java.util.Set;

import com.kodilla.good.patterns.food2door.suppliers.OrderType;
import com.kodilla.good.patterns.food2door.suppliers.Product;

public class HealthyShop implements Supplier {

    @Override
    public OrderType getSupplierName() {
        return OrderType.HEALTHY_SHOP;
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
