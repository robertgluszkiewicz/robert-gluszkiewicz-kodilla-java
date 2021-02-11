package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void sendMessage(User user) {
        System.out.println("Order confirmation sent by mail.");
    }
}
