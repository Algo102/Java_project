package Lecture.Lec4;

import java.util.*;

// Deque - основный принцип, что можно добавлять/извлекать данные как в начало, так и конец

public class L4_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); // добавляет элемент в начало очереди
        deque.addLast(2); // добавляет элемент в конец очереди
        deque.removeFirst(); // возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        deque.removeLast(); // возвращает с удалением элемент из конца очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        deque.offerFirst(1); // boolean offerFirst(E obj): добавляет элемент obj в самое начало очереди. Если элемент удачно добавлен, возвращает true, иначе - false
        deque.offerLast(2); // boolean offerLast(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false
        deque.pollFirst(); // возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
        deque.pollLast(); // возвращает с удалением последний элемент очереди. Если очередь пуста, возвращает значение null
        deque.getFirst(); // возвращает без удаления элемент из головы очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        deque.getLast(); // возвращает без удаления последний элемент очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        deque.peekFirst(); // возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
        deque.peekLast(); // возвращает без удаления последний элемент очереди. Если очередь пуста, возвращает значение null
    }
}

// E pop(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

// void push(E element): добавляет элемент в самое начало очереди

// boolean removeFirstOccurrence(Object obj): удаляет первый встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.

// boolean removeLastOccurrence(Object obj): удаляет последний встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.