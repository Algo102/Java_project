package Practic.Ali.Ex4;

public class Static {
  public static void main(String[] args) {

    //Т.к. эта статика, то обращение без создание объектов, апрямую через класс
    Human.description = "Nice";
    Human.getDescription();

    Human h1 = new Human("Bob", 40);
    Human h2 = new Human("Bob", 40);
    // Создали другой объект с такими же значениями, но переременные разные, т.к. принадлежат разным объектам. А статическая переменная у всех одна и таже

    // Вызываем метод со статической переменной, через любой объект, так как переменная общая
    h1.countNumberPeople();

    h2.setName("Leha");
    h2.setAge(25);
    Human.description = "Bad";
    h1.getAllField();
    h2.getAllField();




    // // К примеру в яве есть статический класс Math, к которому мы обращаемся не создавая объект
    // System.out.println(Math.pow(2, 4)); //2^4
    // System.out.println(Math.min(2, 4)); //2
    // // В Math так же заложенные переменные такие как Пи, в данном случае еще и константа final
    // System.out.println(Math.PI);


  } 
}

class Human{
  // поля пренадлежат к созданным объектам
  private String name;
  private int age;

  // Введем новую статическую переменную для подсчета людей, 0 можно не писать 
  private static int countPeople = 0;

  // А статичесская переменная принадлежит классу
  // И относится ко всем объектами класса, будет общей
  // Начинает существовать как только запускаем программу
  public static String description;

  // final указывает на то что это константа
  // переменную принято писать с большими буквами
  // Сразу указываем значение, т.к. это константа
  // Не всегда, но обычно указывают static, т.к. нет смысла в каждом объекте заводить свою переменную
  public static final int CONST = 10;

  
  public Human(String name, int age){
    this.name = name;
    this.age = age;
    countPeople++; //После создания каждого объекта счетчик будет увеличиваться. Переменная содержится в любом созданном объекте
  }

  public void countNumberPeople(){
    System.out.println("Всего людей "+ countPeople);
  }


  public void setName(String name){
    this.name = name;
  }
  
  public void setAge(int age) {
    this.age = age;
  }

  // СТАТИЧЕСКИЙ метод, может работать только со статическими переменныи, так как он один на класс и общий для всех объектов, вписать на вывод поля не получится, так как они у каждого объекта свои
  // Используем, если не нужно создавать объект класса для того чтоб воспользоваться этим методом
  public static void getDescription(){
    System.out.println(description);;
  }

  // Метод который выводит все поля
  public void getAllField(){
    System.out.println(name + " , " + age + " , " +  description);
  }

  

}
