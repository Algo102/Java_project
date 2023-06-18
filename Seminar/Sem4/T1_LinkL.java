package Seminar.Sem4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое: Принимает от пользователя строку вида text
// 1. Нужно сохранить text в связный список.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// 3. Выход из программы - exit

// qwe [qwe]
// tre [qwe, tre]
// zxc [qwe, tre, zxc]
// print~1 tre [qwe, zxc]
// print~1 zxc [qwe]

public class T1_LinkL {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите Ваш текст: ");
    System.out.println("Для удаления элемента введите print~num, num - номер элемента ");
    System.out.println("Для выхода из программ введите exit ");

    String textIn = in.nextLine();

    LinkedList<String> linkLis1 = new LinkedList<>();

    while (!textIn.equals("exit")) { // Если текст не равен exit/сравнение строк/
      //  if(textIn.contains("print~") // Если строка содержит
      if(textIn.startsWith("print~")){ // Если текст начинаеися с print~
        // Можно сделать replace() - подмена символов
        // можно substring (), что будет возвращаться часть строки из переменной
        int num = Integer.parseInt(textIn.split("~")[1]); // Разделяем текст по ~, берем вторую часть и переводим в int
        linkLis1.remove(num); // Удаляем значение по НЕ ЯВНОМУ индексу       
      }
      else
        linkLis1.add(textIn);
      System.out.println(linkLis1);
      System.out.println("Введите Ваш текст: ");
      textIn = in.nextLine();
    } 
    in.close(); // Закрыл сканер, хотя все работает и без закрытия     
  }
}
