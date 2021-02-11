package com.kodilla.good.patterns.food2door.suppliers.shops;

import java.util.HashSet;
import java.util.Set;

import com.kodilla.good.patterns.food2door.suppliers.Product;

public class ExtraFoodShop implements Supplier {

    @Override
    public String getSupplierName() {
        return "Extra Food Shop";
    }

    @Override
    public Set<Product> getProducts() {
        Set<Product> extraFoodShopProducts = new HashSet<>();
        extraFoodShopProducts.add(new Product("Marchew", 1234, 4.34));
        return extraFoodShopProducts;
    }

    @Override
    public boolean process() {
        System.out.println("Order sent by mail");
        return true;
    }
}
