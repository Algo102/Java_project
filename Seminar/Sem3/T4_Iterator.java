package Seminar.Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Создать список ArrayList со строками и числами. 
// Пройти по списку и удалить числа
public class T4_Iterator {
  public static void main(String[] args) {
    
    // List array = new ArrayList<>(); // можно и так, разници нет
    List<Object> array1 = new ArrayList<>(Arrays.asList("Земля", 12, "Земля", 3, 4, "Земля", "Земля")); 

    for (int i = 0; i < array1.size(); i++) {
      if (array1.get(i) instanceof Integer){ // если элемент принадлежит к типу Integer
        array1.remove(i);
        i--; // Т.к. у нас в списке есть 2 цифры подряд, то при удалении первой цифры в следующей итерации пропускается вторая цифра, поэтому после каждого удаления и смещаем на 1 назад
      }
    }
    System.out.println(array1);


    // ДРУГОЙ ВАРИАНТ. Чтоб не делать i--, можно пойти с конца
    List<Object> array2 = new ArrayList<>(Arrays.asList("Земля", 12, "Земля", 3, 4, "Земля", "Земля"));
    for (int i = array2.size()-1; i >= 0; i--) {
      if (array2.get(i) instanceof Integer){ 
        array2.remove(i);        
      }
    }
    System.out.println(array2);
    

    // ДРУГОЙ ВАРИАНТ. c ИТЕРАТОРОМ
    List<Object> array3 = new ArrayList<>(Arrays.asList("Земля", 12, "Земля", 3, 4, "Земля", "Земля", 55));
    Iterator it = array3.iterator();
    while (it.hasNext()) { // Пока у него есть следующий
      // Если текущее число
      if (it.next() instanceof Integer) { 
        it.remove(); // то удаляем, по ссылке, и нет сползаний как в первом примере
      }
    }
    System.out.println(array3);

  }  
}
