package com.kodilla.good.patterns.challenges;

public class User {

    private final String userFirstName;
    private final String userLastName;

    public User(String userFirstName, String userLastName) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }
}
