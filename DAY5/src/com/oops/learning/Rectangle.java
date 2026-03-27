package com.oops.learning;

public class Rectangle {
    int length;
    int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
