package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class ChallengesMain {
    public static void main(String[] args) {

        String movies = MovieStore.getMovies().entrySet().stream()
                .flatMap(title -> title.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movies);
    }
}
