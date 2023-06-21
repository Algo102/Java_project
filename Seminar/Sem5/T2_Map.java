package Seminar.Sem5;

import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. 
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)  n:c, o:o, t:d, e:e
// Пример 1:
// Input: s = "foo", t = "bar", f:b, o:a, --- false
// Output: false

// Пример 2:
// Input: s = "paper", t = "title" p:t, a:i, e:l, r:e,
// Output: true


public class T2_Map {
  public static void main(String[] args) {
    String etalon = new String("paper"); // Вводим наши строки
    String check = new String("titie");
    System.out.println(checker(etalon, check));
  }

  public static boolean checker(String etalon, String check) {
    if (etalon.length() != check.length()) {// сразу проверяем длину обоих слов, если разные то и подставлять буквы нет смысла
      return false;
    }
    Map<Character, Character> compare = new HashMap<>();
    for (int i = 0; i < etalon.length(); i++) {// бежим по буквам эталонного слова
      if (!compare.containsKey(etalon.charAt(i))) {// если нет такого ключа, то есть буквы(по очереди)
        if (compare.containsValue(check.charAt(i))) {// если в значении уже есть буква от проверяемого слова
          return false; // к примеру слова paper и titie, буквы е в ключах нет, но i в значениях есть, с другим ключом
        }
        // то в Map добавляем в ключ букву от эталонного слова, а в значение букву от проверяемого слова
        compare.put(etalon.charAt(i), check.charAt(i)); 
      } else {// иначе, если значение(по ключу-букве от эталоного слова) не равно букве в проверяемом слове
        if (compare.get(etalon.charAt(i)) != check.charAt(i)) {
          return false;
        }
      }
    }
    return true;
  }  
}
