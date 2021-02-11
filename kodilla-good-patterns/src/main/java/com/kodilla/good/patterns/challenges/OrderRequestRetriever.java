package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("David", "Smith");

        Product product = new Product("0001", "Czajnik", 100 );

        return new OrderRequest(user, product);
    }
}
