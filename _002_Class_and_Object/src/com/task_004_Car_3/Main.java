package com.task_004_Car_3;

/**
 * (Заново!) Создать класс Машина с полями
 * год(int), скорость(double), вес(int) цвет(String).
 * Создать конструктор по умолчанию,
 * конструктор с 1-м параметром, 2-я, 3-я, 4-я.
 * Перегрузить конструкторы вызывая конструктор из конструктора.
 * Создать класс Main, в котором создать экземляры класса Машина
 * с разными параметрами.
 */

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car(1901, 30, 500, "Black");
        Car car_2 = new Car(1899, 25, 400);
        Car car_3 = new Car(1880, 20);
        Car car_4 = new Car(1870);

        System.out.println("Car_1: " + car_1.getCarInfo());
        System.out.println("Car_2: " + car_2.getCarInfo());
        System.out.println("Car_3: " + car_3.getCarInfo());
        System.out.println("Car_4: " + car_4.getCarInfo());
    }
}
