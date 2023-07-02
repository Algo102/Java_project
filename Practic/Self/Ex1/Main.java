package Practic.Self.Ex1;

public class Main {
  public static void main(String[] args) {
    Point pt = new Point();
    pt.x = 1;
    pt.y = 2;

    Point pt2 = new Point();
    pt2.x = 10;
    pt2.y = 20;

    System.out.println("x = "+pt.x+", y = " + pt.y);
    System.out.println("x = "+pt2.x+", y = " + pt2.y);
    
  }

}

class Point{
  int x,y;
}
