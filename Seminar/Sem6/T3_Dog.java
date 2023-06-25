package Seminar.Sem6;

import java.util.ArrayList;

public class T3_Dog {
  public static void main(String[] args) {
    ArrayList <Dog> dogoteka = new ArrayList<>();
    Dog dog1 = new Dog("Макс", 3, "Серной");
    Dog dog2 = new Dog("Мося", 12);

    // dog2.name = "Моська"; // не получится, т.к. private
    dog2.setName("Моська"); // А так получится при private

    dogoteka.add(dog1);
    dogoteka.add(dog2);

    System.out.println(dog1);
    System.out.println(dogoteka);
    
    dog1.Golos();

  }
  
}
