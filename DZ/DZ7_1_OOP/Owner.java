package DZ.DZ7_1_OOP;

public class Owner {
  private String name;

  public Owner(String name){
    this.name = name;
  }

  @Override
  public String toString() {        
    return name;
  }  
}
