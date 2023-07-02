package Practic.Ali.Ex1;

public class ClassAndObject {
  public static void main(String[] args) {
    // Класс - тип данных
    Person pers1 = new Person();
    pers1.name = "Vanya";
    pers1.age = 25;
    System.out.println("Я "+ pers1.name+" мне "+pers1.age+" лет");

    Person pers2 = new Person();
    pers2.name = "Roma";
    pers2.age = 27;
    System.out.println("Я "+ pers2.name+" мне "+pers2.age+" лет");

  }
  
}

class Person{
  // Данные (поля)
  String name;
  int age;

  //Действия, которые совершает объект (методы)
}
