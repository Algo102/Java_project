package DZ.DZ3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import Lecture.Lec1.array;

// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение


public class HW_ArrList {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>(Arrays.asList(3,2,4,9,5,7,8));
    System.out.println(al);
    
    // 4) Найти среднее ариф. значение
    Double sum1 = 0d;
    for (Integer item : al) {
      sum1 +=  item;
    }
    Double res1 = sum1 / al.size();
    System.out.printf("Средне арифмитическое значение равно: %.2f", res1);

    // 4) Найти среднее ариф. значение - ИТЕРАТОР
    Iterator<Integer> ial1 = al.iterator();
    Double sum0 = 0d;
    while (ial1.hasNext()) {
        sum0 += ial1.next();        
    }
    Double res2 = sum1 / al.size();
    System.out.printf("\nСредне арифмитическое значение равно: %.2f", res2);

   

    // 2) Найти минимальное значение    
    // 3) Найти максимальное значение
    // 4) Найти среднее ариф. значение
    int maks = al.get(0);
    int mini = al.get(0);
    Double sum2 = 0d;
    for (int i =0; i < al.size(); i++) {
      sum2 += al.get(i);
      if (al.get(i) > maks)
        maks = al.get(i);  
      if (al.get(i) < mini)
        mini = al.get(i);
    }
    Double res3 = sum2 / al.size();
    System.out.printf("\nМаксимальное число: %d. Минимальное: %d. Сумма: %.0f. Среднее: %.3f",maks, mini, sum2, res3);
    
    // 1) Нужно удалить из него чётные числа
    // for (int i = 0; i < al.size(); i++) {
    //   if(al.get(i) % 2 == 0){
    //     al.remove(i);
    //     i--;
    //   }  
    // }
    // System.out.println("\n" + al);

    // 1) Нужно удалить из него чётные числа - ЧЕРЕЗ ИТЕРАТОР
    Iterator<Integer> ial2 = al.iterator();
    while (ial2.hasNext()) {
      if (ial2.next() %2 == 0)
        ial2.remove();
    }
    System.out.println("\n" + al);   
  }  
}
