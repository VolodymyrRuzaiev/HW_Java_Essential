/**
 * создать проект, пакет. Используя класс Zoo Задания 2,
 * удалить 3, 5, 7 животные,
 * узнать размер списка и вывести в консоль.
 */
package task_003_Remove_Part_of_Zoo;

import task_002_Zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        // adding the elements to list
        zoo.arrayList.add(0, "Lion");
        zoo.arrayList.add(1, "Zebra");
        zoo.arrayList.add(2, "Giraffe");
        zoo.arrayList.add(3, "Hippo");

        zoo.arrayList.add(4, "Sloth");
        zoo.arrayList.add(5, "Mammoth");
        zoo.arrayList.add(6, "Tiger");
        zoo.arrayList.add(7, "Squirrel");

        System.out.println("Size of list: " + zoo.arrayList.size());
        for (int i = 0; i < zoo.arrayList.size(); i++) {
            System.out.println(i + ": " + zoo.arrayList.get(i));
        }

        System.out.println("---------------------");

//         удаление элементов по индексу
        for (int i = 0; i < zoo.arrayList.size(); i++) {
          String animal = zoo.arrayList.get(i);
            if (animal == "Hippo" || animal == "Mammoth" || animal == "Squirrel")
            {
                int index = zoo.arrayList.indexOf(animal);
                zoo.arrayList.remove(index);

            }
//            if (i == 3 || i == 5 || i == 7) {
//                zoo.arrayList.remove(i);
//                --i;
//            }

        }
        System.out.println("Size of list: " + zoo.arrayList.size());
//        for (int i = 0; i < zoo.arrayList.size(); i++) {
//            System.out.println(i + ": " + zoo.arrayList.get(i));
//
//        }

        Integer index = 0;
        for (String animal: zoo.arrayList) {

            System.out.println(index + ": " + animal);
            index++;
        }
    }
}
