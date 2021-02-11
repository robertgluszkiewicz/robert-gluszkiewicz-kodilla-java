package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product) {

        System.out.println("The order has been created.");
    }
}
