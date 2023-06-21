package Lecture.Lec5;

import java.util.*;

// HashTable "устаревший брат" коллекции HashMap, не знает про null, соответственно не позволяет их хранить
// Итог. Если критичски не нужны null, то можно использовать, хотя проще использовать предидущие коллекции с проверкой на null
// Весь функционал такой же как и у предидущих коллекций

public class L6_HashTable {
    public static void main(String[] args) {
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException
    }
}
