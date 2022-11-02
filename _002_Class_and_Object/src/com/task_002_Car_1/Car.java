package com.task_002_Car_1;

public class Car {

    int year;
    String color;

    // Constructor default
    public Car() {

    }

    // Method - Constructor with type Car with 1 par
    public Car(int year) {
        this.year = year;

    }

    // Method - Constructor with type Car with 2 par
    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public String getCarInfo(){

        return "year: " + this.year + " color: " + this.color;
    }
}
