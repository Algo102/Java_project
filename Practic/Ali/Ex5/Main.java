package Practic.Ali.Ex5;

public class Main {
  public static void main(String[] args) {
    // Создавая такой объект мы не знаем какое это животное
    Animal animal1 = new Animal();
    animal1.eat();
    animal1.sleep();

    Dog dog1 = new Dog();
    dog1.eat();
    dog1.sleep();
    dog1.bark();
    dog1.eat();
    dog1.showName();
  }
  ;

  
}
