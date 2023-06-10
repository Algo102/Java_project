package Lecture.Lec2;

public class str {
  public static void main(String[] args) {
    
    // Заполнение строки 300_000 плюсиками

    // Код работает через обычные строки. Работает 40 сек
    // double t = System.currentTimeMillis();
    // String str = "";
    // for (int index = 0; index < 300_000; index++) {
    //   str += "+";
    // }
    // System.out.println(System.currentTimeMillis() - t + "msec");

    // API строки. Этот же результат дстигается за 1 сек.
    // double s = System.currentTimeMillis();
    // StringBuilder sb = new StringBuilder();
    // for (int index = 0; index < 300_000; index++) {
    //   sb.append("+");
    // }
    // System.out.println(System.currentTimeMillis() - s + "msec");


    // concat(): объединение строк
    // valueOf(): преобразует Object в строковое представление (завязан на toString())
    // join(): объединяет набор строк в одну с учетом разделителя
    // charAt(): получение символа по индексу
    // indexOf(): первый индекс вхождения подстроки
    // lastIndexOf(): последний индекс вхождения подстроки
    // startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
    // replace(): замена одной подстроки на другую
    // trim(): удаляет начальные и конечные пробелы
    // substring(): возвращает подстроку, см.аргументы
    // toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
    // сompareTo(): сравнивает две строки
    // equals(): сравнивает строки с учетом регистра
    // equalsIgnoreCase(): сравнивает строки без учета регистра
    // regionMatches(): сравнивает подстроки в строках


    String[] name = {"С", "е", "р", "г", "е", "й"};
    String sk = "СЕРГЕЙ КА.";
    System.out.println(sk.toLowerCase()); // сергей ка.
    System.out.println(String.join("", name)); // Сергей
    System.out.println(String.join("", "С", "е", "р", "г", "е", "й")); // Сергей
    System.out.println(String.join(",", "С", "е", "р", "г", "е", "й")); // С,е,р,г,е,й

  }
}
