package Lecture.Lec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class L8_ArLOf {
    public static void main(String[] args) {
        
        // Создаем List символов с помощью List.of, но при таком методе создания - элементы не удаляются
        // List.of(item1, item2,...) – возвращает неизменяемый список
        //List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');

        //list1.remove(1); // ошибка - java.lang.UnsupportedOperationException

        
        // Поэтому создаем коллекцию ArrayList стандартными способами 
        // Arrays.asList – преобразует массив в список
        // List<Character> list1 = new ArrayList<>(Arrays.asList('S', 'e', 'r', 'g', 'e', 'y'));
        // System.out.println(list1);
        

        // Можно создать и так
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        list1.add('e');
        list1.add('y');

        System.out.println(list1);
        list1.remove(1); // Удалили второй элемент
        System.out.println(list1);

        
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
        
    }
}
 