package com.kodilla.good.patterns.food2door.suppliers;

import com.kodilla.good.patterns.food2door.suppliers.shops.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.suppliers.shops.Supplier;

public class Application {
    public static void main(String[] args) {


        Supplier extraFoodShop = new ExtraFoodShop();
        extraFoodShop.getProducts();

        System.out.println("Order status from " + extraFoodShop.getSupplierName()
                + " is: " + extraFoodShop.process());
    }
}
