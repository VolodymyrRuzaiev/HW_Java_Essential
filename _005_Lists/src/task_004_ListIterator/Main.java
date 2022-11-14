/**
 * Main, создать список целых чисел и используя ListIterator
 * пройтись по списку и увеличить значения на 1
 */

package task_004_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // list declaration
        ArrayList<Integer> arrayList = new ArrayList<>();

        // adding the elements to list
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        ListIterator<Integer> iterator = arrayList.listIterator();

        while (iterator.hasNext()){
            int element = iterator.next();
            element++;
            System.out.println("New element: " + element);
        }

    }
}
