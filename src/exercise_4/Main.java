package exercise_4;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Завдання 4
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Main, створити список цілих чисел і
 * за допомогою ListIterator пройтись по списку і збільшити значення на 1.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.println("Вихідний список: " + arrayList);

        ListIterator<Integer> iterator = arrayList.listIterator();

        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            iterator.set(integer + 1);
        }

        System.out.println("Змінений список: " + arrayList);
    }

}
