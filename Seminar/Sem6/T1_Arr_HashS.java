package Seminar.Sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 99 элементов случайными цифрами от 0 до 50.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
// в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class T1_Arr_HashS {
  public static void main(String[] args) {
    Integer[] array = RndArray(99, 0, 51);
    System.out.println(Arrays.toString(array));
    // double res = ArraySetDouble(array);  
    // System.out.printf("%.2f ", res);
    System.out.printf("%.2f ",ArraySetDouble(array));
  }

  public static Integer[] RndArray(int length, int low, int high){
    Random rnd = new Random();
    Integer[] array = new Integer[length];
    for (int i = 0; i < array.length; i++) {
      array[i] = rnd.nextInt(low, high);
    }
    return array;
  }

  public static double ArraySetDouble(Integer[] array){    
    // //Set<Integer> set = new HashSet<>(Arrays.asList(array)); // Можно так вместо 2 строчек ниже
    Set<Integer> set = new HashSet<>();
    // set.addAll(Arrays.asList(array)); //  Заполнили addAll
    

    for (int i = 0; i < array.length; i++) { //  Заполнили add через цикл
     set.add(array[i]);
    }
    System.out.println(set);

    return (double)set.size() / array.length * 100; // Чтоб все уравнение преобразовать в double достаточно перед любой переменной поставить double
  }
}
