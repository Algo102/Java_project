package Practic.Ali.Ex5;

public class Dog extends Animal {
  // Все методы из Анимал наследовались в Дог
  // Создадим метод который есть только у собаки. Гавкать

  public void bark(){
    System.out.println("I'm dog, bark bark");
  }

  // Переопределим метод родителя и сабака будет есть по своему
  public void eat(){
    System.out.println("I'm dog, and eating");
  }

  // в этом классе нет поля с именем, используем имя из родительского класса
  public void showName(){
    System.out.println(name);
  }
  
}
