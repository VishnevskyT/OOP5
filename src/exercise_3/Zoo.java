package exercise_3;

import java.util.ArrayList;

/**
 * Завдання 3
 * Використовуючи Intelij IDEA, створити проект, пакет. Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин,
 * дізнатися розмір списку і вивести в консоль.
 */

public class Zoo {

    public static void main(String[] args) {

        ArrayList<String> zoo = new ArrayList<>();

        zoo.add(0, "(1)броненосець");
        zoo.add(1,"(2)качконіс");
        zoo.add(2, "(3)панда мала");
        zoo.add(3, "(4)медоїд");
        zoo.add(4, "(5)коала сірий");
        zoo.add(5,"(6)тапір");
        zoo.add(6,"(7)товстий лорі");
        zoo.add(7, "(8)мармозетка Гьольді");
        System.out.println("Базовий список твариан: " + zoo);
        zoo.remove(2);
        zoo.remove(3);
        zoo.remove("(7)товстий лорі");


        System.out.println("Список тварин після видалення: " + zoo + ";\nРозмір списку: " + zoo.size());
    }
}
