package Seminar.Sem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// Написать метод, который принимает массив элементов,
// помещает их в очередь и выводит на консоль содержимое очереди.

public class T3_Queue {
  public static void main(String[] args) {
    Random rand = new Random();

    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      int num = rand.nextInt(0, 10);
      arr[i] = num;
    }
    System.out.println(Arrays.toString(arr));

    System.out.println(PrintArr(arr));

    PrintArr2(arr);
  }

  // Через возращаемый тип Queue
  public static Queue<Integer> PrintArr(int[] array){
    Queue<Integer> quAr = new LinkedList<>(); // Queue наследуется от LinkedList, поэтому и создаем список так
    // for (int i = 0; i < array.length; i++) {
    //   quAr.add(array[i]);
    // }
    for (Integer i : array) { // Тоже самое, через foreach
      quAr.add(i);
    }
    return quAr;
  }

  // Через void, ничего не возвращаем
  public static void PrintArr2(int[] array){
    Queue<Integer> quAr = new LinkedList<>(); 
    // for (int i = 0; i < array.length; i++) {
    //   quAr.add(array[i]);
    // }
    for (Integer i : array) {
      quAr.add(i);
    }
    System.out.println(quAr);;
  }
  
}
