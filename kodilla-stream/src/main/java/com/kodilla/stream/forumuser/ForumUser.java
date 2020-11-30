package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPost;

    public ForumUser(final int userId, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPost) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPost = numberOfPost;
    }

    public int getUserId() {
        return userId;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return  "(user Id = " + userId +
                ", user name = '" + userName + '\'' +
                ", sex = " + sex +
                ", birth date = " + birthDate +
                ", number of post = " + numberOfPost +
                ')';
    }
}