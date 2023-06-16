package Lecture.Lec3;


import java.util.ArrayList;
import java.util.List;

public class L5_AddArrList {

  public static void main(String[] args) {
    // Добавление в ArrayList элементов разного типа
    List list = new ArrayList();
    list.add(2809);
    list.add("string line");

    for (Object o : list) {
      System.out.println(o); 
      // А с извлечением будет проблема
    }


    // Добавление в ArrayList элементов одного типа
    List<Integer> list1 = new ArrayList();
    list1.add(2809);
    list1.add(132);
    // list1.add("string line"); // Добавить уже не получиться

    for (Object o : list1) {
      System.out.println(o); 
      // А с извлечением будет проблем не будет
    }




  }
}

