package Seminar.Sem2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class fil {
  public static void main(String[] args) {
    // Записать в файл слово ТЕСТ 10 раз
    int n = 10;
    String text = "TEST";
    // try{
    //   FileWriter writer = new FileWriter("file.txt", false); // true добавляет, false перезаписывает - по умолчанию
    //   for (int i = 0; i < n; i++) {
    //     writer.write((i+1)+ " " + text);
    //     writer.write("\n");
    //   }
    //   System.out.println("Получилось!");
    //   writer.close();
    // }
    // catch (Exception e){ //Считование всех ошибок - е
    //   System.out.println("Что то пошло не так");
    // }


    // // Чтение из файла по символьно
    // try{
    //   FileReader file = new FileReader("file.txt");
    //   char[] arr = new char[20]; // Считывает массивами по 20 символов, пробелы и переносы тоже символы
    //   file.read(arr); 
    //   for (char c : arr) {
    //     System.out.print(c);
    //   }
    //   file.close();
    //   System.out.println("\n"+"Получилось!");
    // }
    // catch(Exception e){
    //   System.out.println("Что то пошло не так");
    // }

    
    // Чтение из файла полностью
    File fl = new File("file.txt");    
    try{      
      FileReader file = new FileReader(fl);
      char[] arr = new char[(int) fl.length()]; 
      file.read(arr); 
      for (char c : arr) {
        System.out.print(c);
      }
      file.close();
      System.out.println("\n"+"Получилось!");
    }
    catch(Exception e){
      System.out.println("Что то пошло не так");
    }  


  }
}
