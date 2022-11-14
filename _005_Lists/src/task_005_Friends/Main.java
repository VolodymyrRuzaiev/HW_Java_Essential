/**
 * создать класс Friends. С помощью методов ArrayList добавить в массив имена друзей.
 * Вывести список друзей, после вывести список друзей отсортировав в алфавитном порядке.
 */

package task_005_Friends;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Friends v_friends = new Friends();
        v_friends.list_friends.add("Max");
        v_friends.list_friends.add("SergeyP");
        v_friends.list_friends.add("SergeyD");
        v_friends.list_friends.add("SergeyG");
        v_friends.list_friends.add("SergeyL");
        v_friends.list_friends.add("Igor");
        v_friends.list_friends.add("Valera");
        v_friends.list_friends.add("Alex");
        v_friends.list_friends.add("Egor");
        v_friends.list_friends.add("Artur");
        v_friends.list_friends.add("Meruzhan");

        Collections.sort(v_friends.list_friends);
        v_friends.list_friends.forEach(System.out::println);

//        for (int i = 0; i < v_friends.list_friends.size(); i++) {
//            System.out.println(v_friends.list_friends.get(i));
//        }

    }

}