package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main( String [] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e) {
            System.out.println("There was an exception.");
        } finally {
            System.out.println("Finaly over!");
        }
    }
}