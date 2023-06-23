package Lecture.Lec6;

import java.util.*;

public class P1_Cl_Program {

    public static void main(String[] args) {
        // #region

        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1); // Lecture.Lec6.Worker@7a81197d. HashCode - 7a81197d
        System.out.println(w2.toString()); // Lecture.Lec6.Worker@5ca881b5 - не помог, нужно определить свой шаблон.
        // Написав свой шаблон toString() в Классе worker, для всех выводов на экран получаем. Выше написанный toString() не влияет
        System.out.println(w3); // id:3000 FN:Имя_3 LN:Фамилия_3 SL:300
        System.out.println(w4); // Lecture.Lec6.Worker@4517d9a3. HashCod-ы разные, поэтому это абсолютно разные объекты 
        //#endregion

        System.out.println(w1==w4); // false. Сравнили - разные экземпляры, но с одинаковыми изночальными-минимальными данными
        System.out.println(w1.equals(w4)); // false - сравниваем через строки. А после написание метода в Worker true
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4)); // false - сравниваем элементы. А после написание метода в Worker true, т.к. под этим Хешом появился w4
        
    }
}