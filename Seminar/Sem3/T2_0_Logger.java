package Seminar.Sem3;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*; 

// Запись в текстовый файл удобнее через логгер.
// Логгеров существует очень много и не все работают корректно.
// Этот логгер с json не работает, и трудно найти тот который будет работать корректно

public class T2_0_Logger {
  public static void main(String[] args) throws IOException{

        Logger ll = Logger.getLogger(T2_0_Logger.class.getName()); // Создаем логгер именно для нашего класса, в котором он запускается. И все изменения в классе будут изночально сохраняться в логгере. И это ни как не возможно достать, пока не соединим логгер с файлом
        
        String logsPath = "log.txt"; // создаем ПУТЬ для файла, где будут храниться логи
        
        // Условия для соединения логера с файлом. Путь и при false, каждый запуск перезапись
        FileHandler fh = new FileHandler(logsPath, false);
        
        // Соединяем логгер с файлом. 
        ll.addHandler(fh); // Логгер уже поимает, что он будет записывать в какой-то файл

        // лог выводится в xml формате который стоит по дефолту, удобен при работе с программами
        // XMLFormatter formatter = new XMLFormatter();

        // Если нужно сейчас наглядно посмотреть, то подключаем этот формат
        SimpleFormatter formatter = new SimpleFormatter();
     
        // Показываем FileHandler, с каким форматом нужно работать
        fh.setFormatter(formatter);

        // Для примера работы логгера, создаем рандом
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10); // Создает число 10 раз
            ll.log(Level.INFO,"element: " + a); // 10 раз записывает его в лог на УРОВЕНЬ ИНФОРМАЦИИ
        }

        // после выхода из цикла, записываем НА УРОВЕНЬ ПРЕДУПРЕЖДЕНИЯ
        ll.log(Level.WARNING, "logger off" );
        ll.info("test"); // аналог написания INFO, модернизированная запись
        ll.warning("logsPath"); // аналог написания WARNING, модернизированная запись
    }
  
}
