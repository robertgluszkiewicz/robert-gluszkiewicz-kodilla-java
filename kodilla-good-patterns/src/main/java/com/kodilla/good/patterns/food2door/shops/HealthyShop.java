package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.order.OrderType;

public class HealthyShop implements Supplier {

    @Override
    public OrderType getSupplierName() {
        return OrderType.HEALTHY_SHOP;
    }

    @Override
    public void process() {
        System.out.println("Order sent by BI system");
    }
}