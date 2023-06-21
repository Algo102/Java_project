package Lecture.Lec5;

import java.util.*;

// LinkedHashMap "старший брат" HashMap, медленее чем HashMap, но хранит элементы по порядку и помнит его
// По функционалу ничего не меняется
// Итог. Если нам важен порядок и скорость не важна, то ипользуем LinkedHashMap

public class L5_LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}
    }
}
