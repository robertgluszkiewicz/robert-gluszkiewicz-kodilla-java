package com.kodilla.stream.immutable;

public final class ForumUserTask_7_2 {
    private final String userName;
    private final String realName;

    public ForumUserTask_7_2(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}