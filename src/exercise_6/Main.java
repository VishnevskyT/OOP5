package exercise_6;

import java.util.ArrayList;

/**
 * Завдання 6
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити class Main, у ньому створити список, додати вчителів,
 * яких ви зможете згадати зі школи. І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Глобус Карта Географівна");
        arrayList.add("Станок Метал Плоскогубович");
        arrayList.add("М'яч Спортзал Валейболович");
        arrayList.add("Кут Бісектриса Прямокутівна");
        arrayList.add("Спирт Молекула Фазотронівна");
        for (String teacher : arrayList) {
            System.out.print(teacher + ", ");
        }

        System.out.println("\n\nНайкращий вчитель: " + arrayList.get(arrayList.lastIndexOf("Спирт Молекула Фазотронівна")));
        System.out.println("\nБезпосередній вчитель: " + arrayList.get(1));

        System.out.println("\n\n\nDisclaimer: Всі персонажі є вигаданими, та будь-який збіг з реально живими або померлими людьми випадковий");
    }
}
