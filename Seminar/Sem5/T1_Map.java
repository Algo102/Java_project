package Seminar.Sem5;

import java.util.HashMap;
import java.util.Map;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

public class T1_Map {
  public static void main(String[] args) {
    Map<Integer, String> book = new HashMap<>();
    book.put(123456, "Иванов");
    book.put(321456, "Васильев");
    book.put(234561, "Петрова");
    book.put(234432, "Иванов");
    book.put(654321, "Петрова");
    book.put(345678, "Иванов");

    // первый способ
    for (var item : book.entrySet()) {// пробегаем по всем парам, а entrySet() достает ключ и значение
      if(item.getValue().equals("Иванов")) // ищем сравнивая значения, equals сравнение строк
        System.out.printf("[%d, %s]\n", item.getKey(), item.getValue()); // вместо d можно написать s, выдаст визуально одинаково, но число переведет в строку
    }

    System.out.println("-------------------------");

    // второй способ
    for (Integer key : book.keySet()) { // бежим по ключам
      if(book.get(key).equals("Иванов")) // если значение у ключа равно Иванов/ get(key) = значение у ключа
        System.out.printf("[%d, %s]\n", key, book.get(key));
    }
  }  
}
