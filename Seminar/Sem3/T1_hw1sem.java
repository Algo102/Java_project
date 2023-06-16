package Seminar.Sem3;

import java.util.Scanner;

public class T1_hw1sem {
  /*  Задано уравнение вида x + y = z. Где, (x, y, z) >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
Вывод: 24 + 45 = 69                                                      */

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // Создаем сканер
        System.out.print("Enter equation like '2? + ?5 = 69': "); // Сообщение для пользователя
        String equation = iScanner.nextLine(); // Принимаем сообщение от пользователя
        String message = "Решения нет!"; // Заготавливаем сообщение заранее, если оно понадобится
        boolean flag = true;
        for (int i = 0; (i < 10) && flag; i++) {  //&& flag
            String result = equation.replace("?", Integer.toString(i)); // сначала без флага, for-ом заменяем ? с помощью replace на i (переведенной к строке). 
            //System.out.println(result); // Показываем полученный результат
            // 1итер: result = 24 + 45 = 69
            String[] arr = result.split(" "); // Сплитуем полученную строчку в строчный массив
            if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])){ // переводим каждый элемент в инт и проверяем равенство
                message = result; // если получается, то в message  записываем нашу новую строку с правильным решением, если нет то переберираем другие i(от 0 до 9)
                flag = false; // flag - нужен, чтоб не бежать дальше по циклу, если уже нашлось одно решение
            }
        }        
        System.out.println(message); // Если решения нет, то message в цикле не поменялось бы и выдало заложенный ответ, если поменялось, то выдаст решение
        iScanner.close();
    }
}

