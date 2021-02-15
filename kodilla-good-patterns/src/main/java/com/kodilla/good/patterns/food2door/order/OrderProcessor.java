package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.shops.SuppliersRepository;

public class OrderProcessor {

    public void processOrder(Order order) {
        SuppliersRepository.createSuppliersRepository().stream()
                .filter(shop -> shop.getSupplierName().equals(order.getOrderType()))
                .peek(shop -> shop.process())
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Shop not found!"));

        System.out.println(order);
        System.out.println("Order has been processed");
    }
}