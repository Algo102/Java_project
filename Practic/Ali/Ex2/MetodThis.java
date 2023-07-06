package Practic.Ali.Ex2;

import java.util.Arrays;

public class MetodThis {
  public static void main(String[] args) {
    Person pers1 = new Person(); 
    pers1.setName("Gosha"); 
    pers1.setAge(12);  

    System.out.println(pers1.getName());
    System.out.println(pers1.getAge());
    pers1.speak(1);

    Person pers2 = new Person();
    pers2.setName("Tom");
    pers2.setAge(18);
    pers2.speak(1);
    pers2.getInfo();
    
  }
  
}

class Person{  
  private String name;
  private int age;

  // Сетеры нужны чтоб скрыть прямой доступ к полю, и чтоб задать какую то логику, например ограничить ввод пустого имени
  
  // Если хотим в аргументе указать перемеменную  с таким же именем как и в поле класса, то программе нужно помочь и с помощью this показать что обращаемся к полю класса, а точнее к конкретному созданному объекту.  
  //public void setName(String username){ 
  public void setName(String name){
    if(name.isEmpty()) 
      System.out.println("Пустое имя нельзя");    
    else
      this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setAge(int age) {
    if(age<0)
      System.out.println("Возраст должен быть больше 0");
    else
      this.age = age;
  }
  public int getAge() {
    return age;
  }

  public void getInfo(){
    System.out.println(name + " , " + age);
  }
  
  void speak(int count){
    for (int i = 0; i < count; i++) {
      System.out.println("Я "+ name+" мне "+age+" лет");
    }    
  }  
  
  void sayHello(int ... args){
    System.out.println("Hello!!!" + Arrays.toString(args));    
  }  

  int calculYearsToRetirement2(){
    int years= 65 - age;
    return years;
  }  


}
