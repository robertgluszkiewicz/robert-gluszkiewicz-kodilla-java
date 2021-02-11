package com.kodilla.good.patterns.food2door.suppliers.shops;

import java.util.HashSet;
import java.util.Set;

import com.kodilla.good.patterns.food2door.suppliers.Product;

public class GlutenFreeShop implements Supplier {

    @Override
    public String getSupplierName() {
        return "Gluten Free Shop";
    }

    @Override
    public Set<Product> getProducts() {
        Set<Product> glutenFreeShopProduct = new HashSet<>();
        glutenFreeShopProduct.add(new Product("Kukurydza", 873, 2.99));
        return glutenFreeShopProduct;
    }

    @Override
    public boolean process() {
        System.out.println("Order sent by fax");
        return true;
    }
}
