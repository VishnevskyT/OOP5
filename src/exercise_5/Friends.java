package exercise_5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Завдання 5
 * Використовуючи Intelij IDEA, створити клас Friends. За допомогою методів ArrayList додати масив імена друзів.
 * Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
 */

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.add("Сашко");
        arrayList.add("Славко");
        arrayList.add("Левко");
        arrayList.add("Мишко");
        arrayList.add("Валя");
        arrayList.add("Маня");
        arrayList.add("Таня");
        arrayList.add("Клара");

        System.out.println("Вихідний список друзів: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Відсортований А-Я список друзів: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("Відсортований Я-А список друзів: " + arrayList);

    }
}
