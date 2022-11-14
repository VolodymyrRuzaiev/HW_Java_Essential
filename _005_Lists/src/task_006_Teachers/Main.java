/**
 * Создать class Main, в нем создать список, добавить учителей,
 * которых вы только сможете вспомнить со школы.
 * И получить индекс самого лучшего учителя и самого не очень.
 * Вывести список в консоль.
 */

package task_006_Teachers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Albert Einstein", 10));
        teachers.add(new Teacher("Isaac Newton", 7));
        teachers.add(new Teacher("Leonardo Da Vinci", 4));
        teachers.add(new Teacher("Archimedes", 8));
        teachers.add(new Teacher("Nikola Tesla", 1));
        teachers.add(new Teacher("Mike Case", 5));
        teachers.add(new Teacher("Steve Jobs", 2));
        teachers.add(new Teacher("Michael Faraday", 3));
        teachers.add(new Teacher("James Clerk Maxwell", 9));
        teachers.add(new Teacher("Giordano Bruno", 6));

        Collections.sort(teachers);
        teachers.forEach(System.out::println);

    }
}
