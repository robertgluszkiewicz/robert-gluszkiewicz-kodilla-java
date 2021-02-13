package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.order.OrderType;

public class ExtraFoodShop implements Supplier {

    @Override
    public OrderType getSupplierName() {
        return OrderType.EXTRA_FOOD_SHOP;
    }

    @Override
    public void process() {
        System.out.println("Order sent by mail");
    }
}