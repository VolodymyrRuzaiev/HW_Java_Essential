package com.task_004_Computer;

/**
 * Создать класс Computer, создать массив объектов (= экземпляров) Computers размером 5.
 * Далее руками создать 5 объектов (= экземпляров) этого класса и записать в компьютер (используя loop).
 * 1) Создать класс Computer
 * 2) Создать массив объектов Computers [5]
 * 3) Руками создать 5 экземпляров класса Computer
 * 4) Присвоить каждому компьютеру свой цвет
 * 5) Вывести цвета (используя loop)
 */

public class Main {
    public static void main(String[] args) {

        // computers - ПЕРЕМЕННАЯ, т.к. внутри метода!!!
        Computer[] computers = new Computer[5];

        // Руками создать 5 экземпляров (= объектов) класса Computer
        // comp1 - ПЕРЕМЕННАЯ, т.к. внутри метода!!!
        // потенциальное изделие из шаблона (= классов) Computer
        Computer comp1 = new Computer();
        Computer comp2 = new Computer();
        Computer comp3 = new Computer();
        Computer comp4 = new Computer();
        Computer comp5 = new Computer();

        comp1.set_cpu("AMD");
        comp2.set_cpu("Intel");
        comp3.set_cpu("Apple");
        comp4.set_cpu("KiMax");

        computers[0] = comp1;
        computers[1] = comp2;
        computers[2] = comp3;
        computers[3] = comp4;
        computers[4] = comp5;

        for (int i = 0; i < computers.length; i++) {
            computers[i].get_cpu();

        }
    }
}
