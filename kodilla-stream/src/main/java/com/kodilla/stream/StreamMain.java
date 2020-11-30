package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getBirthDate(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getNumberOfPost() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("Number of pairs after filtering: " + theResultMapOfUsers.size());
        System.out.println("Matching pairs (key) : (value)");
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> "(" + entry.getKey() + ")" + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}