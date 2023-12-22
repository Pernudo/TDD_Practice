package com.pernudo.TDD_Practice.model;

public class Car {
    public int speed;

    public void accelerate(int acceleration) {
        speed += acceleration;
    }

    public void slowDown(int deceleration) {
        speed -= deceleration;
        if (speed < 0) speed = 0;
    }
}
