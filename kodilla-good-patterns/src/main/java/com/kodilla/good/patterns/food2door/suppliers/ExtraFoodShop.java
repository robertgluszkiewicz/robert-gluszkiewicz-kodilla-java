package com.kodilla.good.patterns.food2door.suppliers;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements SupplierAdding {

    Map<String, Double> products = new HashMap<>();

    @Override
    public boolean process() {
        System.out.println("Sent the order by mail");
        return true;
    }
}
