package com.kodilla.good.patterns.food2door.order;

public class OrderRetriever {

    public Order retrieve() {
        return new Order(OrderType.GLUTEN_FREE_SHOP, "Kukurydza",234);
    }
}