package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Test suite for calculate forum statistics")
public class ForumStatisticsTestSuite {
    Statistics statisticsMock;
    ForumStatistics forumStatistics;
    List<String> usersNames;

    @BeforeEach
    public void beforeEach() {
        statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
        usersNames = new ArrayList<>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        usersNames.add("User4");
    }

    @AfterEach
    public void afterEach() {
        forumStatistics.showStatistics();
    }

    @DisplayName("Test for quantity of posts = 0")
    @Test
    public void testCalculateAdvStatisticsForPost0() {
        //When
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getQuantityUsers());
        assertEquals(0, forumStatistics.getQuantityPosts());
        assertEquals(0, forumStatistics.getQuantityComments());
        assertEquals(0, forumStatistics.getAverageQuantityPostsPerUser());
        assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser());
        assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost());
    }

    @DisplayName("Test for quantity of posts = 1000")
    @Test
    public void testCalculateAdvStatisticsForPosts1000() {
        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getQuantityUsers());
        assertEquals(1000, forumStatistics.getQuantityPosts());
        assertEquals(2000,forumStatistics.getQuantityComments());
        assertEquals(250, forumStatistics.getAverageQuantityPostsPerUser());
        assertEquals(500, forumStatistics.getAverageQuantityCommentsPerUser());
        assertEquals(2, forumStatistics.getAverageQuantityCommentsPerPost());
    }

    @DisplayName("Test for quantity of comments = 0")
    @Test
    public void testCalculateAdvStatisticsForComments0() {
        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getQuantityUsers());
        assertEquals(1000, forumStatistics.getQuantityPosts());
        assertEquals(0,forumStatistics.getQuantityComments());
        assertEquals(250, forumStatistics.getAverageQuantityPostsPerUser());
        assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser());
        assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost());
    }

    @DisplayName("Test for (quantity of comments) < (quantity of posts)")
    @Test
    public void testCalculateAdvStatisticsForCommentsSmallerThanPosts() {
        //When
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getQuantityUsers());
        assertEquals(1000, forumStatistics.getQuantityPosts());
        assertEquals(100, forumStatistics.getQuantityComments());
        assertEquals(250, forumStatistics.getAverageQuantityPostsPerUser());
        assertEquals(25, forumStatistics.getAverageQuantityCommentsPerUser());
        assertEquals(0.1, forumStatistics.getAverageQuantityCommentsPerPost());
    }

    @DisplayName("Test for (quantity of comments) > (quantity of posts)")
    @Test
    public void testCalculateAdvStatisticsCommentsBiggerThanPosts() {
        //When
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getQuantityUsers());
        assertEquals(100, forumStatistics.getQuantityPosts());
        assertEquals(1000,forumStatistics.getQuantityComments());
        assertEquals(25, forumStatistics.getAverageQuantityPostsPerUser());
        assertEquals(250, forumStatistics.getAverageQuantityCommentsPerUser());
        assertEquals(10, forumStatistics.getAverageQuantityCommentsPerPost());
    }

    @DisplayName("Test for quantity of users = 0")
    @Test
    public void testCalculateAdvStatisticsForUser0() {
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getQuantityUsers());
        assertEquals(0, forumStatistics.getQuantityPosts());
        assertEquals(0, forumStatistics.getQuantityComments());
        assertEquals(0, forumStatistics.getAverageQuantityPostsPerUser());
        assertEquals(0, forumStatistics.getAverageQuantityCommentsPerPost());
        assertEquals(0, forumStatistics.getAverageQuantityCommentsPerUser());
    }

    @DisplayName("Test for quantity of users = 100")
    @Test
    public void testCalculateAdvStatisticsForUser100() {
        //Given
        List<String> usersNames = new ArrayList<>();
        for (int i=0 ; i<100; i++){
            usersNames.add("User"+i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getQuantityUsers());
        assertEquals(1000, forumStatistics.getQuantityPosts());
        assertEquals(2000,forumStatistics.getQuantityComments());
        assertEquals( 10,forumStatistics.getAverageQuantityPostsPerUser());
        assertEquals(20, forumStatistics.getAverageQuantityCommentsPerUser());
        assertEquals(2, forumStatistics.getAverageQuantityCommentsPerPost());
    }
}