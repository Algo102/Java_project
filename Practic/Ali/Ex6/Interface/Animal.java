package Practic.Ali.Ex6.Interface;

// Так как написали Имплиментс, то в классе Анимал обязаны реализовывать в всебе все методы из Инфо, а именно showInfo
// Класс может реализовывать любое количество интерфейсов, их нужно указывать через запятую после Info
// А наследовать может только один другой класс
public class Animal implements Info {
  public int id;

  public Animal(int id){
    this.id = id;
  }

  public void sleep(){
    System.out.println("I'm animal sleeping");
  }

  @Override
  public void showInfo() {
    System.out.println("Id is " + this.id);
  }
}
