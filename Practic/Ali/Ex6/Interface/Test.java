package Practic.Ali.Ex6.Interface;

public class Test {
  public static void main(String[] args) {
    Animal animal1 = new Animal(1);
    Person person1 = new Person("Bob");

    //Благодаря интерфейсу имя метода одинаковое, но реализация разная
    animal1.showInfo();
    person1.showInfo();

    animal1.sleep();
    person1.sayHello();

    // И на оборот, т.к между двумя классами существует связь можем создать объекты
    Info info1 = new Animal(1);
    Info info2 = new Person("Bob");
    info1.showInfo();
    info2.showInfo();


    outputInfo(info1);
    outputInfo(info2);

    // Не важно какой объект, важно чтоб этот объект имел метод showInfo
    outputInfo(animal1);
    outputInfo(person1);

  }

  // Метод принимает то что реализует класс Инфо
  public static void outputInfo(Info info){
    // Реализуем единственный метод
    info.showInfo();
  }
  
}
