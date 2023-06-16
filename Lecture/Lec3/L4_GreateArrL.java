package Lecture.Lec3;

import java.util.ArrayList;

// Варианты создания ArrayList
// Правильнее использовать коллекции через обобщение, т.е. указывать тип

public class L4_GreateArrL {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(); // С указанием типа
        ArrayList<Integer> list2 = new ArrayList<>(); // То же саме, после равно можно Ineger, второй раз не писать
        ArrayList<Integer> list3 = new ArrayList<>(10); // Указываем, что изначально в хранилище будет 10 элементов, если нужно добавить можно всегда еще элементы
        
        System.out.println(list3);
        list3.add(123);

        ArrayList<Integer> list4 = new ArrayList<>(list3); // На основе одной коллекции, создаем другую
        System.out.println(list4);

    }
}
