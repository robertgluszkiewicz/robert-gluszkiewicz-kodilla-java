package com.kodilla.good.patterns.food2door.suppliers.shops;

import java.util.Set;

import com.kodilla.good.patterns.food2door.suppliers.Order;
import com.kodilla.good.patterns.food2door.suppliers.OrderType;
import com.kodilla.good.patterns.food2door.suppliers.Product;

public interface Supplier {

    OrderType getSupplierName();
    boolean process();

    void process(Order order);
}
