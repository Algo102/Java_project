package Seminar.Sem3;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*; 

public class T2_1_Logger {
  public static void main(String[] args) throws IOException{

        Logger ll = Logger.getLogger(T2_1_Logger.class.getName());
        String logsPath = "log2.txt";
        

        // Можно подключить к одному логгеру два файла.
        // К примеру нужно чтоб один постоянно, а другой перезаписывался после нового запуска. Или один в однойкодировке, другой в другой кодировке.
        FileHandler fh = new FileHandler(logsPath, false);
        FileHandler fh1 = new FileHandler("logsPath2.txt", true);

        ll.addHandler(fh);
        ll.addHandler(fh1);

        SimpleFormatter formatter = new SimpleFormatter();
        XMLFormatter formatter2 = new XMLFormatter();
        fh.setFormatter(formatter);
        fh1.setFormatter(formatter2);
        
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            ll.log(Level.INFO,"element: " + a);
        }
        ll.log(Level.WARNING, "logger off" );
        ll.info("test");
        ll.warning("logsPath");
    }
}
