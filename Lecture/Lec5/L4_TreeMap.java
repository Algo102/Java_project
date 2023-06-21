package Lecture.Lec5;

import java.util.*;

// TreeMap - упорядочиване по ключу

public class L4_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); 
        System.out.println(tMap); // {1=один}        
        tMap.put(6,"шесть"); 
        System.out.println(tMap); // {1=один, 6=шесть}        
        tMap.put(4,"четыре"); 
        System.out.println(tMap); // {1=один, 4=четыре, 6=шесть}        
        tMap.put(3,"три"); 
        System.out.println(tMap); // {1=один, 3=три, 4=четыре, 6=шесть}        
        tMap.put(2,"два"); 
        System.out.println(tMap); // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}  

        System.out.println(tMap.descendingKeySet()); // [6, 4, 3, 2, 1]
        System.out.println(tMap.descendingMap()); // {6=шесть, 4=четыре, 3=три, 2=два, 1=один}
        System.out.println(tMap.tailMap(3)); // {3=три, 4=четыре, 6=шесть}
        System.out.println(tMap.headMap(3)); // {1=один, 2=два}
    }
}

// put(K,V) - добавить пару
// get(K) - получаем значение по ключу
// remove(K) - удаление пары по ключу
// descendingKeySet(V) - получение ключей в обратном порядке
// descendingMap() - показать коллекцию в обратном порядке 
// tailMap() - показать коллекцию больше или равно чем ключ
// headMap() - показать коллекцию меньше чем ключ
// lastEntry() 
// firstEntry()
