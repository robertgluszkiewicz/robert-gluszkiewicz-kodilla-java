package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.order.OrderType;

public class GlutenFreeShop implements Supplier {

    @Override
    public OrderType getSupplierName() {
        return OrderType.GLUTEN_FREE_SHOP;
    }

    @Override
    public void process() {
        System.out.println("Order sent by fax");
    }
}