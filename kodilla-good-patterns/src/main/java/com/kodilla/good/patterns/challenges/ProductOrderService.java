package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(final User user, final Product product) {
        System.out.println(user.getUserFirstName() + " " + user.getUserLastName()
                + " ordered: " + product.getProductName());

        return true;
    }
}
