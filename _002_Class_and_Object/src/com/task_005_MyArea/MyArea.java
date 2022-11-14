package com.task_005_MyArea;

public class MyArea {
    final static double Pi = 3.14;
    static double radius;

    public MyArea() {
    }
    public MyArea(double radius) {
        this.radius = radius;
    }
    public static double area0fCircle() {
         return Pi * Math.pow(radius, 2);
    }
}
