package Lecture.Lec2;

import java.io.File;

// Работа с файлами
// File <имя> = new File(<полный путь к файлу>);
public class file {
  public static void main(String[] args) {
    
    // File f1 = new File("file.txt");
    // File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

    // String pathProject = System.getProperty ("user.dir" );
    // String pathFile = pathProject .concat("/file.txt" );
    // File f3 = new File(pathFile);
    // System.out.println(f3.getAbsolutePath ());
    // // /Users/sk/vscode/java_projects/file.txt
    // // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

    // // Работа с ошибками
    // try {
    //   Код, в котором может появиться ошибка
    // } 
    // catch (Exception e) {
    //   Обработка, если ошибка случилась
    // }
    // finally {
    //   Код, который выполнится в любом случае
    // }

    try {
      String pathProject = System.getProperty("user.dir"); // Путь к папке проекта
      String pathFile = pathProject.concat("/file.txt"); // указываем файл
      File f3 = new File(pathFile); // Создаем файл и связываем переменную по  текущему путю
      System.out.println("try"); // Если все Ок, ты выйдет сообщение try
    } 
    catch (Exception e) {
      System.out.println("catch"); // Если не будет файла и путь будет кривой, то выдет сообщение от Эксепшен
    }
    finally { 
      System.out.println("finally"); // Обязтельно будет показан, даже если будет ошибка
    }

    // isHidden(): возвращает истину, если каталог или файл является скрытым
    // length(): возвращает размер файла в байтах
    // lastModified(): возвращает время последнего изменения файла или каталога
    // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    // listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    // mkdir(): создает новый каталог
    // renameTo(File dest): переименовывает файл или каталог
    // length(): возвращает размер файла в байтах
    // lastModified(): возвращает время последнего изменения файла или каталога
    // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    // listFiles(): возвращает массив файлов и подкаталогов, которые
    // находятся в определенном каталоге
    // mkdir(): создает новый каталог
    // renameTo(File dest): переименовывает файл или каталог

  }
}
