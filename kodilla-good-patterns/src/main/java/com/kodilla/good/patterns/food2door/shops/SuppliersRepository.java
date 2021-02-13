package com.kodilla.good.patterns.food2door.shops;

import java.util.HashSet;
import java.util.Set;

public class SuppliersRepository {

    public static Set<Supplier> createSuppliersRepository() {
        Set<Supplier> suppliers = new HashSet<>();
        Supplier extraFoodShop = new ExtraFoodShop();
        Supplier glutenFreeShop = new GlutenFreeShop();
        Supplier healthyShop = new HealthyShop();
        suppliers.add(extraFoodShop);
        suppliers.add(glutenFreeShop);
        suppliers.add(healthyShop);

        return suppliers;
    }
}
