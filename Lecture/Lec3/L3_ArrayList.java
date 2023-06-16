package Lecture.Lec3;

import java.util.ArrayList;
import java.util.List;

public class L3_ArrayList {
    // Пример работы с AarrayList  
    // Если много вставок и удалений элементов луче использовать коллекции, если много просчетов, т.е. работы с элементами, то массив  

   public static void main(String[] args) {
         // Первым словом можно написать и List, т.к. он является общим для ArrayList
        // List list = new ArrayList();
        //ArrayList list = new ArrayList(); // Для конкретики пишем ArrayList, но не указали явно тип, т.е. приводим наш int к Object. При извлечении нужны будут проверки на уточнение типов, чтоб это избежать, нужно указать с каким типом мы работаем, а именно с <Integer>
        // <> -  эти скобки называются обобщение
        //list.add("1234"); // При сыром варианте без уточнения типа, можно положить и int - 2809 и string - "1234"
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(2809); // Добавляем лемент со значением 2809

        for (Object o : list) {
           System.out.println(o);
        }
   }
}
