package Lecture.Lec1;

/**
 * program
 */
public class perem {
  public static void main(String[] args) {
  
    double f = 123.45;
    double f1 = 123.45d;
    float d = 321.54f;

    char ch = '{';
    char ch1 = 123; // Символ по коду, не явное преобразование

    int a = 13;
    double b = a; // int в double помещается т.к. у int 4 байта, а у double 8. Наоборот без преобразования не получится
    
    char ch2 = '1';
    System.out.println(Character.isDigit(ch2)); // true
    ch2 = 'a';
    System.out.println(Character.isDigit(ch2)); // false


    boolean e = true && false;
    System.out.println(e); //согласно таблице истенности false

    boolean e1 = true ^ false;
    System.out.println(e1); //дизьюнкция, когда строго одна true

    boolean e2 = 123 <= 234;
    System.out.println(e2); // true

    String msg = "Hello"; // троки не примитивный тип. 1 символ 2 байта
    System.out.println(msg);

    // var k = 123;
    // System.out.println(k);
    // System.out.println(getType(k)); // вызываем метод

    // var k1 = 123.456;
    // System.out.println(k);

    System.out.println(a);
    System.out.println(b);   

    System.out.println(Integer.MAX_VALUE); // При вводе Integer. выходит выбор разного функционала

    String s = "qwer";
    s.charAt(1); // Даст первый символ
    s.length(); // длина строки - вызываем метод lenght

    int i = 123;
    i++;
    System.out.println(i); //124
    System.out.println(i++); //124. Операция вывода в приоритете, чем постфиксный инкримент
    System.out.println(i); //125
    System.out.println(++i); //126. Если постфиксный инкримент, то приоритет выше чем вывод

    int i1 = 100;
    //i1 = --i1 - i1--; //99 - 99 = 0
    i1 = i1-- - --i1; //100-98???? 
    System.out.println(i1);

    //Побитовые операции
    int c = 5;
    int c1 = 2;
    System.out.println(c | c1);
    // 101
    // 010
    // 111 = 7

    System.out.println(c & c1);
    // 101
    // 010
    // 000 = 0

    System.out.println(c ^ c1); // Разделительное или
    // 101
    // 010
    // 111 = 7

    String s1 = "qww1"; // 4, 0..3
    // т.к. && проверка закончится после первого условия, т.к true
    boolean b1 = s1.length() >= 5 && s1.charAt(4) == '1';
    // т.к. & обязательно будут проверяться все условия
    //boolean b1 = s1.length() >= 5 & s1.charAt(4) == '1';
    System.out.println(b1);


  }
  
  // любой метод д.б. частью класса
  static String getType(Object o){
    return o.getClass().getSimpleName();
  }
   
}