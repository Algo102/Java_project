package Practic.Ali.Ex3;

import java.util.Arrays;

public class Construct {
  public static void main(String[] args) {
    Human human1 = new Human(); 

    Human human2 = new Human("Bob");

    Human human3 = new Human("Smith", 26);




    
  }
  
}
  // У конструктора нет типа возвращаемого значения и имя всегда совпадает с именем класса
class Human{  
  private String name;
  private int age;

  // По умолчанию уже есть конструктор, который создается при создании объекта, без аргументов и с пустым телом, исчезает, если создали свой
  // public Human(){
  //   System.out.println("Привет из первого конструктора");
  // }

  // Перегрузили метод с третьего конструктора, задали параметры по умолчанию, при вызове пустого конструктора
  public Human(){
    this("Tom", 12);
  }


  public Human(String name){
    this.name = name;
  }
  // Можно заводить много конструкторов, но они должны отличаться либо количеством или типом переменных

  public Human(String name, int age){
    this.name = name;
    this.age = age;
  }


  public void setName(String name){
    this.name = name;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }

}

