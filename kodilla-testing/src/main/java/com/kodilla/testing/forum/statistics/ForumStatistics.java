package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int quantityUsers;
    private int quantityPosts;
    private int quantityComments;
    private double averageQuantityPostsPerUser;
    private double averageQuantityCommentsPerUser;
    private double averageQuantityCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        quantityUsers = statistics.usersNames().size();
        quantityPosts = statistics.postsCount();
        quantityComments = statistics.commentsCount();

        if (quantityUsers == 0) {
            averageQuantityPostsPerUser = 0;
            averageQuantityCommentsPerUser = 0;
        } else {
            averageQuantityPostsPerUser = (double)quantityPosts / (double)quantityUsers;
            averageQuantityCommentsPerUser = (double)quantityComments / (double)quantityUsers;
        }

        if (quantityPosts == 0) {
            averageQuantityCommentsPerPost = 0;
        } else {
            averageQuantityCommentsPerPost = (double)quantityComments / (double)quantityPosts;
        }
    }

    public int getQuantityUsers() {
        return quantityUsers;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    public int getQuantityComments() {
        return quantityComments;
    }

    public double getAverageQuantityPostsPerUser() {
        return averageQuantityPostsPerUser;
    }

    public double getAverageQuantityCommentsPerUser() {
        return averageQuantityCommentsPerUser;
    }

    public double getAverageQuantityCommentsPerPost() {
        return averageQuantityCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("Quantity users: " + quantityUsers);
        System.out.println("Quantity posts: " + quantityPosts);
        System.out.println("Quantity comments: " + quantityComments);
        System.out.println("Average quantity of posts per user: " + averageQuantityPostsPerUser);
        System.out.println("Average quantity of comments per user: " + averageQuantityCommentsPerUser);
        System.out.println("Average quantity of comments per post: " + averageQuantityCommentsPerPost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumStatistics that = (ForumStatistics) o;

        if (quantityUsers != that.quantityUsers) return false;
        if (quantityPosts != that.quantityPosts) return false;
        if (quantityComments != that.quantityComments) return false;
        if (Double.compare(that.averageQuantityPostsPerUser, averageQuantityPostsPerUser) != 0) return false;
        if (Double.compare(that.averageQuantityCommentsPerUser, averageQuantityCommentsPerUser) != 0)
            return false;
        return Double.compare(that.averageQuantityCommentsPerPost, averageQuantityCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = quantityUsers;
        result = 31 * result + quantityPosts;
        result = 31 * result + quantityComments;
        temp = Double.doubleToLongBits(averageQuantityPostsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageQuantityCommentsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageQuantityCommentsPerPost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}