package com.task_005_MyArea;

public class MyArea {
    final static double pi = 3.14;
    static double radius;

    public MyArea() {
    }
    public MyArea(double radius) {
        this.radius = radius;
    }
    public static double area0fCircle() {
         return pi * Math.pow(radius, 2);
    }
}
