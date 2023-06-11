package Seminar.Sem2;

public class strbuilder {
  public static void main(String[] args) {
    // StringBuffer работает гораздо быстрее, по факту создаются новая строка из массива char
    // В основном применяется, чтоб собрать строчку
    String stroka = "asdfg";

    // StringBuilder sb = new StringBuilder(stroka); // строку передали в СтрингБилдер
    // System.out.println(sb);
    // System.out.println(sb.toString()); // Первели обратно в строку

    StringBuilder sb = new StringBuilder(); // создали пустой СтрингБилдер
    sb.append('a'); // Добавили новый объект - символ
    sb.append(stroka); // Добавили нашу строку
    sb.append("St"); // Добавили новый объект - строку
    System.out.println(sb.toString()); // Первели обратно в строку
  }
  
}
