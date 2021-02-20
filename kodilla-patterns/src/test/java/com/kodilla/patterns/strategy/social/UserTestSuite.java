package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User jan = new Millenials("Jan Kowalski");
        User kacper = new YGeneration("Kacper Kacperski");
        User brajan = new ZGeneration("Brajan Jets");

        //When
        String janShouldShare = jan.sharePost();
        System.out.println("Jan should share on: " + janShouldShare);
        String kacperShouldShare = kacper.sharePost();
        System.out.println("Kacper should share on: " + kacperShouldShare);
        String brajanShouldShare = brajan.sharePost();
        System.out.println("Brajan should share on: " + brajanShouldShare);

        //Then
        assertEquals("Facebook", janShouldShare);
        assertEquals("Twitter", kacperShouldShare);
        assertEquals("Snapchat", brajanShouldShare);
    }

    @Test
    void testIndividualSharingStrategies() {

        //Given
        User jan = new Millenials("Jan Kowalski");

        //When
        String janShouldShare = jan.sharePost();
        System.out.println("Jan should share on: " + janShouldShare);
        jan.setSocialPublisher(new SnapchatPublisher());
        janShouldShare = jan.sharePost();
        System.out.println("Jan now should share on: " + janShouldShare);

        //Then
        assertEquals("Snapchat", janShouldShare);
    }
}
