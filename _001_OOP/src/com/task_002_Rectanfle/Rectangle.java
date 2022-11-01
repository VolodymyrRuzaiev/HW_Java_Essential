
package com.task_002_Rectanfle;

public class Rectangle {

    //    создать два поля, описывающие длины сторон double side1, double side2
    private double side_1;
    private double side_2;

    //    создать метод, вычисляющий площадь прямоугольника
    public void areaCalculator(double side_1, double side_2) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        System.out.println("The area of this Rectangle = " + (this.side_1 * this.side_2));
    }
    //    создать метод, вычисляющий периметр прямоугольника
    public void perimeterCalculator(double side_1, double side_2) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        System.out.println("The perimeter of this Rectangle = " + (this.side_1 + this.side_2) * 2);
    }

}
