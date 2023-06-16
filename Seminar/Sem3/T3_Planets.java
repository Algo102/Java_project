package Seminar.Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

public class T3_Planets {
  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Земля", "Земля", "Юпитер", "Марс", "Венера", "Марс", "Плутон"));
    System.out.println(list1);
    System.out.println(list1.size()); // Количество элементов
    int count = 1;
    ArrayList<String> list2 = new ArrayList<>(); // Новый список для уникальных элементов

    for (int i = 0; i < list1.size(); i++) {
      if (!list2.contains(list1.get(i))) { // Если элемент отсутствует в list2, то идем дальше по for
        list2.add(list1.get(i)); // вносим в list2 новый уникальный элемент
        count = 1;
        for (int j = i + 1; j < list1.size()-1; j++) {
          if (list1.get(i) == list1.get(j)) { // Проверяем в list1 ссылочные элементы на равенство
            count += 1;
          }
        }
        System.out.println(list1.get(i) + " " + count + " раза");
      }
    }

    // ДРУГОЕ РЕШЕНИЕ
    // Сначало вводим список всевозможных планет
    final List<String> allPanet = Arrays.asList("earth", "mars", "venera", "jupyter", "saturn", "neptun", "uran", "mercury", "pluton");

    // Заводим коллекцию счетчиков под каждую планету
    List<Integer> numbers =  Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0);

    // Список с которым мы работаем
    String[] planets = new String[]{"earth", "earth", "jupyter", "mars", "venera", "mars", "pluton"};
    System.out.println(Arrays.toString(planets));

      for (String item : planets){ // Пробегаемся по значениям этих планет
        // Назначаем индекс планете, переводя названия всех планет в нижний регистр
        int idx = allPanet.indexOf(item.toLowerCase()); 
          //if (idx != -1){ // В данном случае условие не нужно т.к. если планета есть, значение и так будет не -1
            numbers.set(idx, numbers.get(idx) + 1); // В случае повтора планеты суммируем значение по индексу
         // }
      }
      // Вывод всех у кого значение больше 0
      for (int i = 0; i<allPanet.size(); ++i){
        if (numbers.get(i) > 0){
          System.out.println(allPanet.get(i) + ": " + numbers.get(i));
        }
      }
  }
}
