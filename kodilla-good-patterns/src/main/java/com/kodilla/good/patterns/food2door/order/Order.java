package com.kodilla.good.patterns.food2door.order;

public class Order {

    private final OrderType orderType;
    private final String productName;
    private final int quantity;

    public Order(final OrderType orderType, final String productName, final int quantity) {
        this.orderType = orderType;
        this.productName = productName;
        this.quantity = quantity;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    @Override
    public String toString() {
        return "Order - " +
                "Supplier: " + orderType +
                ", productName: " + productName +
                ", quantity: " + quantity;
    }
}