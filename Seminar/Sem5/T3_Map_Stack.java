package Seminar.Sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь
// <({[]})> --- истина
public class T3_Map_Stack {
  public static void main(String[] args) {
    String input = new String("(<{a}+>{(d*3)}"); // Вводим иходную строку
    System.out.println(comparesmentMap(input));
  }

  public static boolean comparesmentMap(String input) {
    char[] symbols = input.toCharArray(); // разбиваем строку на символы
    Stack<Character> stack = new Stack<>(); // Заводим Стек
    Map<Character, Character> map = new HashMap<>(); // Заводим Мар
    map.put('}', '{'); // Вносим в МАП уникальные примеры скобок, как ключ и значение
    map.put(')', '(');
    map.put(']', '[');
    map.put('>', '<');
    for (Character item : symbols) { // Бежим по массиву символов
      if (map.containsValue(item)) { // Если в МАП есть значение такое же как и символ
        stack.push(item); // то заносим его в СТЕК, поэтому и в значение заносим открывающиеся скобки
      }
      if (map.containsKey(item)) { // Если в МАП есть значение этого ключ, как и символ
        // Если СТЕК пустой или если последний добавленный (сравниваем и удаляем) в СТЕК не равен текущему значению (по символу-ключу со слова) в МАП
        if (stack.empty() || stack.pop() != map.get(item)) {
          return false; 
        }
      }
    }
    // Если в СТЕК остались не удаленные скобки то false (<{a}+>, как тут первая(, которая записалась в стек, но рор ее не далил
    // Истина возвращается, когда СТЕК пустой.
    // Если просто записать true, то метод удалит все пары и выдаст true
    return stack.empty(); 
  }  
}
