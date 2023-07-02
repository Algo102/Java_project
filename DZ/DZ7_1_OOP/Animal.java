package DZ.DZ7_1_OOP;

// Дз: добавить в класс Animal публичные методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса наследника Animal, умеющих летать, плавать, бегать, но не все наследники умеют летать и плавать. Добейтесь того, чтобы наследники, которые, например, не умеют летать, - не могли этого делать.


public abstract class Animal {
    protected int id;
    protected String name;
    protected int age;    
    protected String color;
    protected boolean vaccin;    
    protected Owner owner;
    

    public Animal(int id, String name, int age, String color, boolean vaccin, Owner owner){
      this.id = id;
      this.name = name;
      this.age = age;
      this.color = color;
      this.vaccin = vaccin;
      this.owner = owner;
    }
    
    public void toGo(){
      System.out.println(this.name + " бежит");
    }

    public void fly(){
      System.out.println(this.name + " летит");
    }

    public void swim(){
      System.out.println(this.name + " плывет");
    }


  
}
