package Lecture.Lec3;
// На этом примере видно, что в Объект можно поместить любой тип и работать с ним, учитывая что разных типов существует большое множество, то пришлось написать бы большое мнодество методов, а в данном случае 1.
// Object - это изночальный прорадитель всех типов, а от него уже исходяи инт стринг чар и т.д., а так же свои придуманные типы, поэтому в Обжект можно поместить все что угодно и оно будет работать по базовым заложенным фунциям.

public class L1_Object {
  public static void main(String[] args) {
    Object o = 1; // Integer
    GetType(o);

    o = 1.2; // Duoble
    GetType(o);
  }

  static void GetType(Object obj){
    System.out.println(obj.getClass().getName());
  }
}