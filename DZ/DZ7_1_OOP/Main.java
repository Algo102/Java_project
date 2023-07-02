package DZ.DZ7_1_OOP;

public class Main {
  public static void main(String[] args) {
    // // Создал кота от родительского класса и он полетел, но после того как родительский класс перевел в Абстракт, недочет устранился
    // Animal cat0 = new Animal(1, "КетTest", 2, "Черный", false, null);
    // cat0.fly();

    Cat cat1 = new Cat(0, "Кот1", 0, null, false, null);      
    cat1.fly();
    cat1.toGo();
    cat1.swim();

    Duck duck1 = new Duck(0, "Утка1", 0, null, false, null);
    duck1.fly();
    duck1.toGo();
    duck1.swim();

    Kit kit1 = new Kit(0, "Кит1", 0, null, false, null);
    kit1.fly();
    kit1.toGo();
    kit1.swim();



  } 
}
