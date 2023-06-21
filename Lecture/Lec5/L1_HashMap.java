package Lecture.Lec5;

import java.util.*;
 
public class L1_HashMap {
    public static void main(String[] args) {  
        // Первый тип для ключа, второй для значения
        // нажав на HashMap и потом F12 можно посмотреть исходники      
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один"); // Добавляет, если такой ключ есть, то добавлять не будем
        db.put(2, "два"); // Добавляет, если ключ уже есть, то перезапишет
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44)); // null - получение значения по указанному ключу.
        db.remove(null); // - удаляет пару по указанному ключу.
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true - проверка наличия значения.
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true - проверка наличия ключа
        System.out.println(db.keySet()); // [1, 2] - возвращает множество ключей
        System.out.println(db.values()); // [один, два] - возвращает набор значений
    }
}

// put(K,V) – добавить пару если или изменить значение,если ключ имеется.
// putIfAbsent(K,V) – произвести добавление если ключ не найден.
// get(K) - получение значения по указанному ключу.
// remove(K) – удаляет пару по указанному ключу.
// containsValue(V) – проверка наличия значения.
// containsKey(V) – проверка наличия ключа.
// keySet() – возвращает множество ключей.
// values() – возвращает набор значений.