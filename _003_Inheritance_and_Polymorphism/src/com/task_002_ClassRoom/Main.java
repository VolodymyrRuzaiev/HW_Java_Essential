package com.task_002_ClassRoom;

/**
 * Создать класс, представляющий учебный класс ClassRoom.
 * Создайте класс ученик Pupil. В теле класса создайте методы
 * void study(), void read(), void write(), void relax().
 * Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil
 * от класса базового класса Pupil и переопределите каждый из методов,
 * в зависимости от успеваемости ученика.
 * Конструктор класса ClassRoom принимает аргументы типа Pupil,
 * класс должен состоять из 4 учеников. Предусмотрите возможность того,
 * что пользователь может передать 2 или 3 аргумента.
 * Выведите информацию о том, как все ученики экземпляра класса
 * ClassRoom умеют учиться, читать, писать, отдыхать.
 */
public class Main {
    public static void main(String[] args) {
        Pupil pupil_1 = new Pupil();
        ExcellentPupil pupil_2 = new ExcellentPupil();
        GoodPupil pupil_3 = new GoodPupil();
        BadPupil pupil_4 = new BadPupil();

        pupil_1.read();
        pupil_4.read();
    }

}
