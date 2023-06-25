package Seminar.Sem6;

public class Dog {
  private String name;
  private String poroda;
  private Integer age;

  public Dog(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Dog(String name, Integer age, String poroda) {
    this.name = name;
    this.age = age;
    this.poroda = poroda;
  }

  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void Golos() {
    System.out.println(this.name + " say gaf");
  }

  @Override
  public String toString() {    
    return "Имя: " + name + "." + "  Возраст: " + age;
  }
  
}
