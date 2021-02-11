package com.kodilla.good.patterns.food2door.suppliers;

public class Order {

    private OrderType orderType;
    private String productName;
    private int quantity;

    public Order(OrderType orderType, String productName, int quantity) {
        this.orderType = orderType;
        this.productName = productName;
        this.quantity = quantity;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
