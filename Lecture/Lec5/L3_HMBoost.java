package Lecture.Lec5;

import java.util.*;

public class L3_HMBoost {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>(); // В скобках пусто, т.к. количество элементов не определено
        Map<Integer,String> map2 = new HashMap<>(30); // указали 30 элементов, но при заполнении 75-80% произойдет удвоение
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f); // Указали при каком проценте заполнения, нужно произвести удвоение
    }
}