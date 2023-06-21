package Lecture.Lec5;

import java.util.*;

public class L2_HMForeach {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db); 

        // С помощью этого итератора entrySet() пробегаемся по коллекции, который достает пары
        for (var item : db.entrySet()) {
            // getKey() - получение ключа. getValue() - получение значения
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}