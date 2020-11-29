package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "marshall", 'M', 2000, 7,13, 45 ));
        forumUsers.add(new ForumUser(2, "ryder", 'M', 1939, 9,1, 0 ));
        forumUsers.add(new ForumUser(3, "chase", 'M', 2015, 2,2, 10 ));
        forumUsers.add(new ForumUser(4, "sky", 'F', 1989, 1,1, 9 ));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsers);
    }
}