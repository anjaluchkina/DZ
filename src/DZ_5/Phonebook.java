//Реализуйте структуру телефонной книги с помощью Map, учитывая, что 1 человек может иметь несколько телефонов и у человека уникальное имя.
// Поработать с методами Map.
// Отсортировать Map в обратном порядке.

package DZ_5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        contact("Иванов", 8915123, bookPhone);
        contact("Петров", 8268749, bookPhone);
        contact("Лучкин", 8916359, bookPhone);
        contact("Дземин", 8915948, bookPhone);
        contact("Кабанов", 8916798, bookPhone);
        contact("Петров", 8499157, bookPhone);
        contact("Смирнов", 8495679, bookPhone);
        contact("Кабанов", 8963497, bookPhone);
        contact("Иванов", 84996814, bookPhone);

        printMapSortedByName(bookPhone);

    }

    public static void contact(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    private static void printMapSortedByName(Map<String, ArrayList<Integer>> map) {
        System.out.println("Сортировка по фамилиям:");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println();
    }
}