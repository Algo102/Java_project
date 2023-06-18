package Seminar.Sem4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная 
// была первой в списке, а первая - последней и чистит весь перечень.
// qwe [qwe]
// tre [qwe, tre]
// zxc [qwe, tre, zxc]
// print zxc, tre, qwe 
// []

public class T2_Stack {
  public static void main(String[] args) {
    // try-with-resources в скобках передается ресурс с которым он работает, поэтому закрывать сканер самим не нужно. try нужен для отлавливания ошибок, если ошибка, то catch должен показать. 
    try (Scanner in = new Scanner(System.in)) { 
      System.out.println("Enter your line ");
      String stroka = in.nextLine();
      Stack<String> list1 = new Stack<String>();
      while (!stroka.equals("exit")) {
        if (stroka.equals("print")) {
          // Работать можно только с while, так как список будет динамическим, т.к. будем удалять. foreach и for нельзя
          while (!list1.empty()) { // Пока есть хоть один элемент.
              System.out.println(list1.pop()); // удаляет верхний элемент из стека и возвращает его
          }
        } else {
          list1.push(stroka);
        }
        System.out.println(list1);
        System.out.println("Enter your line ");
        stroka = in.nextLine();
      }      
    }
    catch(Exception e){ // не обязательный блок. Exception e - означает, что нужно ловить все виды ошибок
      System.out.println("Что-то пошло не так");
    }
  }  
}
// try – определяет блок кода, в котором может произойти исключение; catch – определяет блок кода, в котором происходит обработка исключения; finally – определяет блок кода, который является необязательным, но при его наличии выполняется в любом случае независимо от результатов выполнения блока try.