package Practic.Gosh.Ex1;

public class Main {
  
  public static void main(String[] args) {
    Person vitya= new Person();
    System.out.println(vitya.height); // 180
    vitya.height = 120;
    System.out.println(vitya.height); // 120
    vitya.say("George");

    Person vlad= new Person();
    System.out.println(vlad.height); // 180

  }
  
}
