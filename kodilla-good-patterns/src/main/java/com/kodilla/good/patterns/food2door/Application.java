package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.order.OrderProcessor;
import com.kodilla.good.patterns.food2door.order.OrderRetriever;

public class Application {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(orderRetriever.retrieve());
    }
}