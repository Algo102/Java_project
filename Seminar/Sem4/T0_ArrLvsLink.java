package Seminar.Sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

// 1) Замерьте время, за которое добавятся 300_000 элементов в ArrayList и LinkedList.
// Вывод. Добавляются элементы в порядке очереди в LinkedList в 3 раза медленее
// 2) Замерьте время, за которое  добавятся 1 элементов в начало к обоим коллекциям. 
// Вывод. Добавляются элементы в начало в LinkedList в 300 раз быстрее

// ИТОГОВЫЙ ВЫВОД
// AarrayList работает по индексам (по ссылкам индексов), а LinkedList работает по ссылкам и только текущий элемент знает что находится в следующем, поэтому поиск и любые просчеты в LL будут дольше
//Если мы добавляем или удаляем элемент, то просто меняются ссылки у двух крайних элементов, которые наверняка находятся даже не рядом, в отличае от массива, которому придется двигать весь упорядочный ряд
// Если много операций по удалению и добавлению элементов, выгоднее связные списки, при постоянном считывании, выгоднее массив.

public class T0_ArrLvsLink {
  public static void main(String[] args) {

    Random rand = new Random();

    long start1 = System.currentTimeMillis(); // Засекаем начало времени
    ArrayList<Integer> arrLis1 = new ArrayList<>();
    for (int i = 0; i < 300_000; i++) {
      int val = rand.nextInt(0, 10); // Элементы рандомом
      //arrLis1.add(val); // Добавляем в конец
      arrLis1.add(0, val); // добавляем элемент в начало
    }
    long end1 = System.currentTimeMillis(); // Засекаем конец работы программы
    System.out.println(end1 - start1);


    long start2 = System.currentTimeMillis();
    LinkedList<Integer> linkLis2 = new LinkedList();
    for (int i = 0; i < 300_000; i++) {
      int val = rand.nextInt(0, 10);
      //linkLis2.add(val);
      linkLis2.add(0, val);
    }
    long end2 = System.currentTimeMillis();
    System.out.println(end2 - start2);

  }  
}
