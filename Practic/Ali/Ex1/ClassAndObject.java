package Practic.Ali.Ex1;

import java.util.Arrays;

public class ClassAndObject {
  public static void main(String[] args) {
    // Класс - тип данных
    Person pers1 = new Person();
    pers1.name = "Vanya";
    pers1.age = 25;
    //System.out.println("Я "+ pers1.name+" мне "+pers1.age+" лет"); // Создали метод, когда объект говорит
    pers1.sayHello(2);
    pers1.speak(1);
    pers1.calculYearsToRetirement1();

    // Или так через ретурн
    int years1 = pers1.calculYearsToRetirement2();
    System.out.println("Я " + pers1.name + " мне осталось " + years1 + " до пенсии");
    // Или так
    System.out.println("Я " + pers1.name + " мне осталось " + pers1.calculYearsToRetirement2() + " до пенсии");

    Person pers2 = new Person();
    String name2 = "Roma";
    pers2.setName(name2);
    pers2.age = 27;
    System.out.println("Я "+ pers2.name+" мне "+pers2.age+" лет");
    pers2.speak(2);

    Person pers3 = new Person();
    pers3.setName("Maks");
    System.out.println("Я третий человек, меня зовут " + pers3.name);

    Person pers4 = new Person();
    pers4.setNameAndAge("Vasya", 36);
    System.out.println("Я четвертый человек, меня зовут " + pers4.name + " и мне " + pers4.age + " лет");
  }
  
}

class Person{
  // Данные (поля)
  String name;
  int age;

  //Действия, которые совершает объект (методы)
  // Ввел переменную для указания количества повторов
  void speak(int count){
    for (int i = 0; i < count; i++) {
      System.out.println("Я "+ name+" мне "+age+" лет");
    }    
  }

  // Переменная для вывода, которую можно не указывать
  void sayHello(int ... args){
    System.out.println("Hello!!!" + Arrays.toString(args));    
  }

  void calculYearsToRetirement1(){
    int years= 65 - age;
    System.out.println("Я " + name + " мне осталось " + years + " до пенсии");
  }

  int calculYearsToRetirement2(){
    int years= 65 - age;
    return years;
  }

  void setName(String username){
    name = username;
  }

  void setNameAndAge(String username, int userage){
    name = username;
    age = userage;
  }
}
