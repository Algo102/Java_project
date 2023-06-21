package Lecture.Lec5;

import java.util.HashMap;
import java.util.Map;

// MAP - множество коллекций которые работают по принципу ключ/значение
// В работе использует LinkedList, а позже уже на деревьях построенные на списка, бинарные, сбалансированные деревя, красно-черные деревья(теория алгоритмов)
// Элементы располагаются как угодно и могут менять свое положение
// - ускоренная обработка
// - порядок добавления не запоминается
// - ключи оько уникальные
// - null - пустой ключ

public class L0_HahsMap {
  public static void main(String[] args) {    
    // Ключи показываются по порядку, но только примерно одного диапозона, если введем ключ с принципиально другим значением, то его выкинет непонятно куда, связано с образованием Hash
    Map<Integer, String> db = new HashMap<>();
    db.put(1, "один"); System.out.println(db);     // {1=один}
    db.put(2, "два"); System.out.println(db);      // {1=один, 2=два}
    db.put(3, "три"); System.out.println(db);      // {1=один, 2=два, 3=три}
    db.put(31, "три один"); System.out.println(db);// {1=один, 2=два, 3=три, 31=три один}
    db.put(13, "один три"); System.out.println(db);// {1=один, 2=два, 3=три, 13=один три, 31=три один}
    db.put(null, "!null"); System.out.println(db); // {null=!null, 1=один, 2=два, 3=три, 13=один три, 31=три один}
    db.put(null, null); System.out.println(db);    // {null=null, 1=один, 2=два, 3=три, 13=один три, 31=три один} перезаписали  null
    db.put(3000, "три ноль ноль ноль"); System.out.println(db);
  }  
}


