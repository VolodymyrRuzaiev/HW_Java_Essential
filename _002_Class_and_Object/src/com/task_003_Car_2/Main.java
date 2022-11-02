package com.task_003_Car_2;

/**
 * (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
 * Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
 * Перегрузить конструкторы.
 * Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
 */

public class Main {
    public static void main(String[] args) {

        Car car_1 = new Car(2000);
        Car car_2 = new Car(2005, 150);
        Car car_3 = new Car(2010, 200, 1400);
        Car car_4 = new Car(2015, 250, 1600, "Red");

        System.out.println("Car_1: " + car_1.getCarInfo());
        System.out.println("Car_2: " + car_2.getCarInfo());
        System.out.println("Car_3: " + car_3.getCarInfo());
        System.out.println("Car_4: " + car_4.getCarInfo());
    }
}
