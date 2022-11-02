package com.task_002_Car_1;

/**
 * Создать класс Машина с полями год(int), цвет(String). Создать конструктор по умолчанию,
 * и конструкторы с одним и 2-я параметрами. Создать класс Main в котором создать
 * экземпляры вызывая разные конструкторы.
 */
public class Main {
    public static void main(String[] args) {

        Car car_1 = new Car(1998, "Green");//Ask to Constructor with type Car (1 par)
        Car car_2 = new Car(); // Ask to Constructor default
        Car car_3 = new Car(2012);//Ask to Constructor with type Car with 2 par

        System.out.println("Car_1: " + car_1.getCarInfo());
        System.out.println("Car_2: " + car_2.getCarInfo());
        System.out.println("Car_3: " + car_3.getCarInfo());
    }
}
