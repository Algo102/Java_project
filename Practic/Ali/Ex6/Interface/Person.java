package Practic.Ali.Ex6.Interface;

// Так как написали Имплиментс, то в классе Персон обязаны реализовывать в себе все методы из Инфо
// Класс может реализовывать любое количество интерфейсов, их нужно указывать через запятую после Info
// А наследовать может только один другой класс
public class Person implements Info {
  public String name;  

  public Person(String name) {
    this.name = name;
  }

  public void sayHello(){
    System.out.println("I'm human - Hello");
  }

  @Override
  public void showInfo() {
    System.out.println("Name is " + this.name);
  }


  
}
