package com.oops.learning;

public class Car {
    String make;
    String model;
    int year;
    double currentSpeed;

    public void accelerate(double speedIncrease) {
        currentSpeed += speedIncrease;
    }

    public void brake(double speedDecrease) {
        currentSpeed -= speedDecrease;
        if (currentSpeed < 0) currentSpeed = 0;
    }
}
