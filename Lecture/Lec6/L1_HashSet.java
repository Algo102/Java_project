package Lecture.Lec6;

import java.util.*;

// SETы - множества с уникальными значениями
// HashSet - заполнение рандомом по Hesh-у
// TreeSet - заполнение в отсортированном виде
// LinkedHashSet - заполнение в порядке добавления

public class L1_HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); 
        set.add(12); 
        set.add(123);
        set.add(1234); 
        set.add(1234);
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);
        for (var item : set) {
            System.out.println(item); // null 1 1234 123
        }
        set.clear();
        System.out.println(set); // []
    }
}

// isEmpty() – проверка на пустоту.
// add(V) – добавление элемента в коллекцию.
// remove(V) – удаление элемента из коллекцию.
// contains(V) – проверка на включение элемента в коллекции.
// clear() – удаление всех элементов коллекции.
// size() – возвращает количество элементов коллекции.

// addAll(Coll) – объединение множеств.
// retainAll(Coll) – пересечение множеств.
// removeAll(Coll) – разность множеств.

// first()
// last()
// headSet(E) - Возвращает набор в котором все элементы меньше текущего
// tailSet(E) - Возвращает набор в котором все элементы больше текущего
// subSet(E1, E2) - Получим поднабор от одного элемента до другого