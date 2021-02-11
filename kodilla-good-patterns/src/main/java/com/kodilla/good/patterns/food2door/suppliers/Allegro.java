package com.kodilla.good.patterns.food2door.suppliers;

import java.util.Set;

import com.kodilla.good.patterns.food2door.suppliers.shops.Supplier;

public class Allegro {

    private Set<Supplier> suppliers;

    public Allegro(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
    void process(Order order){

        /**
         * Base on the Order, choose supplier
         */
        Supplier supplier = suppliers.stream()
                .filter(shop -> shop.getSupplierName().equals(order.getOrderType()))
                .findFirst()
                .orElseThrow(()->new RuntimeException("Shop not found!"));

        supplier.process(order);

        mailService();

        payment();

        System.out.println("Order has been processed");
    }

}
