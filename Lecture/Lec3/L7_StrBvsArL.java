package Lecture.Lec3;

// Поверяем, поменяется ли конечное значение, после изменения значения у переменной 

import java.util.Arrays;
import java.util.List;

public class L7_StrBvsArL {
    public static void main(String[] args) {
        // Перевод Intового массива в ArrayList
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]

        // Значение в ArrayList осталось такое же после изменения массива, так как просчет идет сверху вниз
        month = 19;
        System.out.println(d); // [29, 9, 1990]



        // ArrayList с типом СтрингБилдер
        StringBuilder day1 = new StringBuilder("15");
        StringBuilder month1 = new StringBuilder("9");
        StringBuilder year1 = new StringBuilder("1990");
        List<StringBuilder> d1 = Arrays.asList(day1, month1, year1);
        System.out.println(d1); // [15, 9, 1990]

        // меняем значение, результат остался преждним
        month1 = new StringBuilder("11");
        System.out.println(d1); // [15, 9, 1990]


        // После перевода массива из СтрингБидеров в ArrayList с типом  СтрингБилдер, конечное значение меняется, т.к. остаются ссылки
        StringBuilder day2 = new StringBuilder("23");
        StringBuilder month2 = new StringBuilder("06");
        StringBuilder year2 = new StringBuilder("1981");
        StringBuilder[] data = new StringBuilder[]{day2, month2, year2};

        List<StringBuilder> d2 = Arrays.asList(data);
        System.out.println(d2); // [23, 06, 1981]

        // Результат НЕ поменялся, т.к. меняли переменную
        month2 = new StringBuilder("11");
        System.out.println(d2); // [23, 06, 1981]

        // Результат ПОМЕНЯЛСЯ, т.к. поменяли элемент массива. Т.к. массив СтрингБидеров и коллекция СтрингБилдеров-ArrayList работает одинаково через ссылки
        data[1] = new StringBuilder("10");
        System.out.println(d2); // [23, 10, 1981]

    }
}