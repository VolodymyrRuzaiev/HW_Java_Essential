package com.task_005_MyArea;
/**
 * Создать класс MyArea, в нем объявить константу PI = 3.14
 * и статический метод areaOfCircle,
 * который должен принимать радиус и используя PI
 * посчитать площадь круга.
 * Создать класс Main, где запустить данный метод.
 *
 */

public class Main {
    public static void main(String[] args) {


        MyArea area_1 = new MyArea(10);

        System.out.println("Area = " + area_1.area0fCircle());



    }
}
