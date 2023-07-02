package DZ.DZ7_1_OOP;

public class Kit extends Animal{

  public Kit(int id, String name, int age, String color, boolean vaccin, Owner owner) {
    super(id, name, age, color, vaccin, owner);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void toGo(){    
    System.out.println(this.name + " нет ножек, НЕ идет");
  }

  @Override
  public void fly(){
    System.out.println(this.name + " нет крыльев, НЕ летит");
  }

  @Override
  public void swim(){
    super.swim();
  }

  
}
