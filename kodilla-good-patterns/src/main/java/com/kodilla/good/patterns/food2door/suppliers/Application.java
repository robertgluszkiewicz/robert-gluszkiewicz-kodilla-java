package com.kodilla.good.patterns.food2door.suppliers;

public class Application {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.getProducts();

        System.out.println("Order status from " + extraFoodShop.getSupplierName()
                + " is: " + extraFoodShop.process());
    }
}
