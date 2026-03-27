package com.oops.learning;

public class User {
    private static int totalUsers = 0;

    public User() {
        totalUsers++;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }
}
