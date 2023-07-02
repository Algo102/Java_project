package Practic.Rabb.Ex1;

public class MainBus {
  public static void main(String[] args) {
    Bus paz1 = new Bus(); // Создали объект
    Bus ikarus1 = new Bus();
    Bus next1 = new Bus();

    paz1.model = "ПАЗ";
    paz1.color = "Синий";
    
    ikarus1.color = "Red";    
    next1.color = "white";

    paz1.showColor();
    ikarus1.showColor();
    next1.showColor();
  }
}
