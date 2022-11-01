package com.task_002_Rectanfle;
/**
 * Создать класс с именем Rectangle. В теле класса создать два поля, описывающие длины сторон double side1, double side2
 * Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
 * и периметр прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу,
 * которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Creating object
        Rectangle me = new Rectangle();

        System.out.println("Enter side_1");
// Scanning
        double side1 = Double.parseDouble(new Scanner(System.in).next());

        System.out.println("Enter side_2");
// Scanning
        double side2 = Double.parseDouble(new Scanner(System.in).next());

        me.areaCalculator(side1, side2);
        me.perimeterCalculator(side1, side2);

    }
}