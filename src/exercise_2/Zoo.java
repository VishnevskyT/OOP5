package exercise_2;

import java.util.ArrayList;

/**
 * Завдання 2
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo. У класі створити список, який
 * записати 8 тварин через метод add(index, element). Вивести список у консоль.
 */

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();

        zoo.add(0, "броненосець");
        zoo.add(1,"качконіс");
        zoo.add(2, "панда мала");
        zoo.add(3, "медоїд");
        zoo.add(4, "коала сірий");
        zoo.add(5,"тапір");
        zoo.add(6,"товстий лорі");
        zoo.add(7, "мармозетка Гьольді");
        System.out.println(zoo);
    }


}
