package com.task_003_Car_2;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
    public String getCarInfo(){
        return "year: " + this.year + " speed: " + this.speed + " weight: " + this.weight + " color: " + color;
    }
}
