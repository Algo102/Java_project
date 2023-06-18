package DZ.DZ4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lecture.Lec1.array;

// Даны два Deque, представляющие два целых числа. 
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.
// Даны два Deque, цифры в обратном порядке.
// [3,2,1] - пример Deque
// [5,4,3]- пример второго Deque
// 1) 123 * 345 = 42 435 - связный список, в обычном порядке [4,2,4,3,5]


public class HW_Queue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ввведите, сколько символов в первом числе: ");
    int num1 = sc.nextInt();   
    Deque<String>  dq1 = new ArrayDeque<>(DqCreate(num1));    
    System.out.println(dq1/*  + " " + dq1.size()*/);
    int num11 = IntOut(dq1);
    

    System.out.print("Ввведите, сколько символов во втором числе: ");
    int num2 = sc.nextInt();   
    Deque<String>  dq2 = new ArrayDeque<>(DqCreate(num2));    
    System.out.println(dq2/*  + " " + dq2.size()*/);
    int num22 = IntOut(dq2);

    int summ = num11 + num22;    
    System.out.printf("Сумма чисел %d и %d равна: %d ", num11, num22, summ);
    Deque<Character> dqSum = new ArrayDeque<>(IntInDeq(summ));
    System.out.println(dqSum);

    int mult = num11 * num22;
    System.out.printf("Произведение чисел %d и %d равно: %d ", num11, num22, mult);
    Deque<Character> dqMult = new ArrayDeque<>(IntInDeq(mult));    
    System.out.println(dqMult);
    
    sc.close();
  }

  //Перевод интового значения, сначала в стринг, а потом в Deque
  public static Deque<Character> IntInDeq(int number){    
    String str = Integer.toString(number);
    Deque<Character> dq = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
      dq.add(str.charAt(i));
    }
    return dq;
  }

  // Перевод Deque с обратного порядка, в правильное число через StringBuilder
  public static Integer IntOut(Deque<String> dq){
    StringBuilder sb = new StringBuilder();
    for (int i = dq.size(); i > 0; i--) {   
      sb.append(dq.pollLast());
    }
    //System.out.println(sb);
    int num = Integer.parseInt(sb.toString());
    return num;
  }

  // Создание двусвязного списка в обратном направлении
  public static Deque<String> DqCreate(int num) {
    Deque<String> dq = new ArrayDeque<>();
    Scanner sc = new Scanner(System.in);
    while (num>0) {
      dq.addFirst(sc.nextLine());
      num--;
    }
    return dq;
  }
}
