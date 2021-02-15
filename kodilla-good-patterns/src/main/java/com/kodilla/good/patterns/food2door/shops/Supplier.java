package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.order.OrderType;

public interface Supplier {

    OrderType getSupplierName();
    void process();
}